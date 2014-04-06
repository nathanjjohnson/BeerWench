package beerwench.beerxml2.viewer;

import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.util.Stack;
import java.util.ArrayList;

import jaxb.beerxml2.util.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.SpringLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class BeerXML2Viewer {

    private JFrame frmBeerxmlRecipeEditor;
    private ArrayList<BeerXml2FilePanel> openFiles;
    private CommandInvoker invoker;
    private JTabbedPane tabbedPane;
    
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BeerXML2Viewer window = new BeerXML2Viewer();
                    window.frmBeerxmlRecipeEditor.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public BeerXML2Viewer() {
        invoker = new CommandInvoker();
        
        initialize();
        openFiles = new ArrayList<BeerXml2FilePanel>();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmBeerxmlRecipeEditor = new JFrame();
        frmBeerxmlRecipeEditor.setTitle("BeerXML2 Recipe Editor");
        frmBeerxmlRecipeEditor.setBounds(100, 100, 648, 450);
        frmBeerxmlRecipeEditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JMenuBar menuBar = new JMenuBar();
        frmBeerxmlRecipeEditor.setJMenuBar(menuBar);
        
        JMenu mnFile = new JMenu("File");
        menuBar.add(mnFile);
        
        JMenuItem mntmOpen = new JMenuItem("Open");
        mntmOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                BeerXml2FilePanel fp = openFileDialog();
                if(fp != null) {
                    addNewFileTab(fp);
                }
            }
        });
        
        JMenuItem mntmNew = new JMenuItem("New");
        mntmNew.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                BeerXml2FilePanel fp = new BeerXml2FilePanel();
                fp.initialize(new BeerXml2File());
                if(fp != null) {
                    addNewFileTab(fp);
                }
            }
        });
        mnFile.add(mntmNew);
        mnFile.add(mntmOpen);
        
        JMenuItem mntmSave = new JMenuItem("Save");
        mnFile.add(mntmSave);
        
        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });
        mnFile.add(mntmExit);
        SpringLayout springLayout = new SpringLayout();
        frmBeerxmlRecipeEditor.getContentPane().setLayout(springLayout);
        
        JToolBar toolBar = new JToolBar();
        springLayout.putConstraint(SpringLayout.NORTH, toolBar, -397, SpringLayout.SOUTH, frmBeerxmlRecipeEditor.getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, toolBar, 0, SpringLayout.WEST, frmBeerxmlRecipeEditor.getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, toolBar, -349, SpringLayout.SOUTH, frmBeerxmlRecipeEditor.getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, toolBar, 0, SpringLayout.EAST, frmBeerxmlRecipeEditor.getContentPane());
        toolBar.setAlignmentY(Component.CENTER_ALIGNMENT);
        toolBar.setMinimumSize(new Dimension(4, 4));
        toolBar.setMaximumSize(new Dimension(4, 4));
        frmBeerxmlRecipeEditor.getContentPane().add(toolBar);
        
        JButton newDocBtn = new JButton("");
        newDocBtn.setToolTipText("New Recipe");
        newDocBtn.setIcon(new ImageIcon(BeerXML2Viewer.class.getResource("/icons/New Document.png")));
        toolBar.add(newDocBtn);
        
        JButton btnImportButton = new JButton("");
        btnImportButton.setToolTipText("Import Recipe from BeerXML");
        btnImportButton.setIcon(new ImageIcon(BeerXML2Viewer.class.getResource("/icons/Import Document.png")));
        toolBar.add(btnImportButton);
        
        JButton btnExportButton = new JButton("");
        btnExportButton.setToolTipText("Export Recipe to BeerXML");
        btnExportButton.setIcon(new ImageIcon(BeerXML2Viewer.class.getResource("/icons/Export To Document.png")));
        toolBar.add(btnExportButton);
        
        JButton btnPrintButton = new JButton("");
        btnPrintButton.setIcon(new ImageIcon(BeerXML2Viewer.class.getResource("/icons/printer_32.png")));
        toolBar.add(btnPrintButton);
        
        JButton btnHelp = new JButton("");
        btnHelp.setHorizontalAlignment(SwingConstants.RIGHT);
        btnHelp.setToolTipText("Display Help");
        btnHelp.setIcon(new ImageIcon(BeerXML2Viewer.class.getResource("/icons/Help Blue Button.png")));
        toolBar.add(btnHelp);
        
        tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        springLayout.putConstraint(SpringLayout.NORTH, tabbedPane, 6, SpringLayout.SOUTH, toolBar);
        springLayout.putConstraint(SpringLayout.WEST, tabbedPane, 0, SpringLayout.WEST, toolBar);
        springLayout.putConstraint(SpringLayout.SOUTH, tabbedPane, 349, SpringLayout.SOUTH, toolBar);
        springLayout.putConstraint(SpringLayout.EAST, tabbedPane, 0, SpringLayout.EAST, toolBar);
        frmBeerxmlRecipeEditor.getContentPane().add(tabbedPane);
    }
    
    public BeerXml2FilePanel openFileDialog() {
        BeerXml2FilePanel newFilePanel = null;
        
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(frmBeerxmlRecipeEditor);
        if(option == JFileChooser.APPROVE_OPTION) {
            BeerXml2File f = new BeerXml2File(fc.getSelectedFile());
            
            if(f.unmarshal()) {
                newFilePanel = new BeerXml2FilePanel();
                newFilePanel.initialize(f);
               // openFiles.add(newFilePanel);

               // getTabbedPane().add("Recipe", newFilePanel);
            }
        }
        return newFilePanel;
    }
    
    public void addNewFileTab(BeerXml2FilePanel fp) {
    //  Create an image icon of the small 'X' for use with a close
        //  button on teach tab. The gif loaded is a 10x10 graphic 
        //  with transparency on areas that are not black.
        openFiles.add(fp);
        
        //ImageIcon closeXIcon = new ImageIcon("/Users/nate/Documents/IconsSet/PNG/Remove.png");
        ImageIcon closeXIcon = new ImageIcon(BeerXML2Viewer.class.getResource("/icons/close_tab_12.png"));
        //  Create a Dimension that can be used to size the close
        //  buttons.
        
        Dimension closeButtonSize = new Dimension(
                closeXIcon.getIconWidth(),
                closeXIcon.getIconHeight());
        
        //final JPanel content = fp;
        
        //  Create a panel that represents the tab and ensure that it
        //  is transparent.
        
        JPanel tab = new JPanel();
        tab.setOpaque(false);
        
        //  Create a label and a Close button for the tab. Be sure to
        //  set its preferred size to nearly the size of the icon, and
        //  create an action listener that will locate the tab and 
        //  remote it from the tabbed pane.
        
        JLabel tabLabel = new JLabel(fp.getBeerXml2File().getName());
        
        JButton tabCloseButton = new JButton(closeXIcon);
        tabCloseButton.setPreferredSize(closeButtonSize);
        tabCloseButton.addActionListener(new ActionListener() {
            
            final int closeTabIndex = openFiles.size()-1;
            
            public void actionPerformed(ActionEvent e) {
                System.out.println("actionPerformed:"+closeTabIndex);

                openFiles.remove(closeTabIndex);
                //int closeTabNumber = 
                //    tabbedPane.indexOfComponent((Component)fp);
                tabbedPane.removeTabAt(closeTabIndex);
            }
            
        });
        
        tab.add(tabLabel, BorderLayout.WEST);
        tab.add(tabCloseButton, BorderLayout.EAST);
        
        //  Add the tab to the tabbed pane. Note that the first
        //  parameter, which would ordinarily be a String that 
        //  represents the tab title, is null.
        
        tabbedPane.addTab(null, fp);
        
        //  Instead of using a String/Icon combination for the tab,
        //  use our panel instead.
        
        tabbedPane.setTabComponentAt(openFiles.size()-1, tab);
        //tabbedPane.setTabComponentAt(getTabbedPane().getTabCount()-1, tab);
        
        
        //getTabbedPane().add("Recipe", fp);
    }
    
    public JTabbedPane getTabbedPane() {
        return tabbedPane;
    }
}

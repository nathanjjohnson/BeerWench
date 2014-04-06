package beerwench.beerxml2.viewer;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.border.TitledBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.util.List;
import javax.swing.SpringLayout;

//generated jaxb imports
import jaxb.beerxml2.FermentableAdditionType;
import jaxb.beerxml2.HopAdditionType;
import jaxb.beerxml2.RecipeType;

//developed by me... good luck
import jaxb.beerxml2.util.BeerXml2File;
import jaxb.beerxml2.util.GrainBillTM;
import jaxb.beerxml2.util.HopBillTM;
import jaxb.beerxml2.util.RecipeHeaderTM;
import java.awt.Component;
import javax.swing.Box;

@SuppressWarnings("serial")
public class BeerXml2FilePanel extends JPanel implements TableModelListener {
    
    private BeerXml2File myFile;
    private JTable table;
    private JTable table_1;
    private JTable table_2;

    /**
     * This method returns the BeerXml2File being displayed by this panel
     * @return BeerXml2File
     */
    public BeerXml2File getBeerXml2File() {
        return myFile;
    }
    
    /**
     * This method initializes the BeerXml2FilePanel
     * @param f BeerXml2File object to use for initialization data
     */
    public void initialize(BeerXml2File f) {
      
       //set our file reference
       myFile = f;
       
       //retrieve the pieces for our tablemodels
       RecipeType recipe = new RecipeType();
       try {
          recipe = f.getBeerXml().getRecipes().getRecipe().get(0);
       }
       catch(NullPointerException npe) {
           npe.printStackTrace();
       }

       
       //create Lists to hold the ingredients
       List<FermentableAdditionType.Addition> fermentables = 
           recipe.getIngredients().getGrainBill().getAddition();
       
       List<HopAdditionType.Addition> hops = 
           recipe.getIngredients().getHopBill().getAddition();
       
       System.out.println("test1");
       if(hops == null || fermentables == null)
       {
    	   System.out.println("one was null");
       }
       
       //attach the view to the model
       RecipeHeaderTM tm1 = new RecipeHeaderTM(recipe);
       GrainBillTM tm2 = new GrainBillTM(fermentables);
       HopBillTM tm3 = new HopBillTM(hops);
          
       //set the tablemodels for the tables
       table.setModel(tm1);
       table_1.setModel(tm2);
       table_2.setModel(tm3);    
       
       tm1.addTableModelListener(this);

    }
    
    /**
     * Create the panel.
     */
    public BeerXml2FilePanel() {
        
        SpringLayout springLayout = new SpringLayout();
        setLayout(springLayout);
        
        JPanel panel = new JPanel();
        springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.WEST, panel, 0, SpringLayout.WEST, this);
        springLayout.putConstraint(SpringLayout.SOUTH, panel, 69, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, panel, 450, SpringLayout.WEST, this);
        panel.setBorder(new TitledBorder(null, "Recipe", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        add(panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[]{0};
        gbl_panel.rowHeights = new int[]{43, 0};
        gbl_panel.columnWeights = new double[]{1.0};
        gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
        panel.setLayout(gbl_panel);
        
        JScrollPane scrollPane = new JScrollPane();
        GridBagConstraints gbc_scrollPane = new GridBagConstraints();
        gbc_scrollPane.fill = GridBagConstraints.BOTH;
        gbc_scrollPane.gridx = 0;
        gbc_scrollPane.gridy = 0;
        panel.add(scrollPane, gbc_scrollPane);
        
        table = new JTable();
        table.setCellSelectionEnabled(true);
        scrollPane.setViewportView(table);
     
        
        JPanel panel_1 = new JPanel();
        springLayout.putConstraint(SpringLayout.NORTH, panel_1, 6, SpringLayout.SOUTH, panel);
        springLayout.putConstraint(SpringLayout.WEST, panel_1, 0, SpringLayout.WEST, panel);
        springLayout.putConstraint(SpringLayout.SOUTH, panel_1, 175, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, panel_1, 450, SpringLayout.WEST, this);
        panel_1.setBorder(new TitledBorder(null, "Grain Bill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        add(panel_1);
        GridBagLayout gbl_panel_1 = new GridBagLayout();
        gbl_panel_1.columnWidths = new int[]{0, 0};
        gbl_panel_1.rowHeights = new int[]{0, 0};
        gbl_panel_1.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_1.rowWeights = new double[]{1.0, Double.MIN_VALUE};
        panel_1.setLayout(gbl_panel_1);
        
        JScrollPane scrollPane_1 = new JScrollPane();
        GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
        gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
        gbc_scrollPane_1.gridx = 0;
        gbc_scrollPane_1.gridy = 0;
        panel_1.add(scrollPane_1, gbc_scrollPane_1);
        
        table_1 = new JTable();
        table_1.setFillsViewportHeight(true);
        table_1.setCellSelectionEnabled(true);
        scrollPane_1.setViewportView(table_1);
        
        JPanel panel_2 = new JPanel();
        springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
        springLayout.putConstraint(SpringLayout.WEST, panel_2, 0, SpringLayout.WEST, panel);
        springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 281, SpringLayout.NORTH, this);
        springLayout.putConstraint(SpringLayout.EAST, panel_2, 450, SpringLayout.WEST, this);
        panel_2.setBorder(new TitledBorder(null, "Hop Bill", TitledBorder.LEADING, TitledBorder.TOP, null, null));
        add(panel_2);
        GridBagLayout gbl_panel_2 = new GridBagLayout();
        gbl_panel_2.columnWidths = new int[]{0, 0};
        gbl_panel_2.rowHeights = new int[]{0, 0};
        gbl_panel_2.columnWeights = new double[]{1.0, Double.MIN_VALUE};
        gbl_panel_2.rowWeights = new double[]{1.0, Double.MIN_VALUE};
        panel_2.setLayout(gbl_panel_2);
        
        JScrollPane scrollPane_2 = new JScrollPane();
        GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
        gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
        gbc_scrollPane_2.gridx = 0;
        gbc_scrollPane_2.gridy = 0;
        panel_2.add(scrollPane_2, gbc_scrollPane_2);
        
        table_2 = new JTable();
        table_2.setCellSelectionEnabled(true);
        scrollPane_2.setViewportView(table_2);

    }
    
    public void tableChanged(TableModelEvent e) {
        System.out.println("caught an event");
    }
}

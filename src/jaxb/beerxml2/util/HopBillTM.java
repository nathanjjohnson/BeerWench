/**
 *  Class HopBillTM 
 *  Implements a TableModel for List<jaxb.beerxml2.HopAdditionType.Addition>
 */
package jaxb.beerxml2.util;

import jaxb.beerxml2.*;

import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * @author nate
 *
 */
@SuppressWarnings("serial")
public class HopBillTM extends AbstractTableModel {
    
    String titles[] = new String[] {
            "Name", "Origin", "AA%", "Form", "Use", "Amount", "Time"    
    };
    
    Class<?> types[] = new Class[] {
            String.class, String.class, String.class, 
            String.class, String.class, String.class, String.class
        };
    
    Object data[][];

    /**
     * Default Constructor
     */
    public HopBillTM() {
        // TODO Auto-generated constructor stub
    }

    /**
     * Constructor from BeermXml HopAdditionType list
     * @param hops
     */
    public HopBillTM(List<HopAdditionType.Addition> hops) {
        setHopSchedule(hops);
    }
    
    /* - Overridden base methods - */
    public int getColumnCount() { return titles.length; }
    public int getRowCount() { return data.length; }
    public String getColumnName(int c) { return titles[c]; }
    public Class<?>  getColumnClass(int c) { return types[c]; }
    public boolean isCellEditable(int row, int col) { return true; }
    
    /**
     * Method to fill the data object array with values.
     * @param hops
     */
    public void setHopSchedule(List<HopAdditionType.Addition> hops) {
        
        //initialize the data array
        data = new Object[hops.size()][titles.length];
        
        
        
        for(int i = 0; i < hops.size(); i++) {          
            data[i][0] = new String(hops.get(i).getName());
            data[i][1] = new String(hops.get(i).getOrigin());
            data[i][2] = new String(hops.get(i).getAlphaAcidUnits().toEngineeringString());
            data[i][3] = new String(hops.get(i).getForm());
            data[i][4] = new String(hops.get(i).getUse());
            data[i][5] = new String(hops.get(i).getAmount().getValue().toEngineeringString());
            data[i][6] = new String(hops.get(i).getTime().getValue().toEngineeringString());
        }    
        //fire a data changed event to notify any listeners
        fireTableDataChanged();
    }
    
    /* (non-Javadoc)
     * @see javax.swing.table.TableModel#getValueAt(int, int)
     */
    @Override
    public Object getValueAt(int arg0, int arg1) {
        // TODO Auto-generated method stub
        return data[arg0][arg1];
    }
    
    public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        fireTableCellUpdated(row, col);
    }
/*
    @Override
    public void addTableModelListener(TableModelListener arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeTableModelListener(TableModelListener arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setValueAt(Object arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
        
        
    }
*/
}

/**
 *  
 */
package jaxb.beerxml2.util;

import jaxb.beerxml2.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

/**
 * @author nate
 *
 */
@SuppressWarnings("serial")
public class GrainBillTM extends AbstractTableModel {
    
    List<FermentableAdditionType.Addition> myData;
    
    String titles[] = new String[] {
            "Name", "Type", "Color", "Origin", "Amount", "After Boil"    
    };
    
    Class<?> types[] = new Class[] {
            String.class, String.class, String.class, 
            String.class, String.class, Boolean.class
    };
    
    // this two-dimensional array holds the table data
    Object data[][];

    /**
     * Default Constructor
     */
    public GrainBillTM() {
        // TODO Auto-generated constructor stub
        myData = new ArrayList<FermentableAdditionType.Addition>();
    }

    public GrainBillTM(List<FermentableAdditionType.Addition> ferms) {
        myData = new ArrayList<FermentableAdditionType.Addition>(ferms);
        setFermentables(myData);
    }
    
    /* - Overridden base methods - */
    public int getColumnCount() { return titles.length; }
    public int getRowCount() { return data.length; }
    public String getColumnName(int c) { return titles[c]; }
    public Class<?>  getColumnClass(int c) { return types[c]; }
    public boolean isCellEditable(int row, int col) { return true; }

    
    public void setFermentables(List<FermentableAdditionType.Addition> ferms) {
        
        // Initialize the data object array;
        data = new Object[ferms.size()][titles.length];

        for(int i = 0; i < ferms.size(); i++) {
                                    
            //set the data of the multi-dimensional array
            data[i][0] = new String(ferms.get(i).getName());
            data[i][1] = new String(ferms.get(i).getType());
            data[i][2] = new String(ferms.get(i).getColor().getValue().toEngineeringString());
            data[i][3] = new String(ferms.get(i).getOrigin());
            data[i][4] = new String(ferms.get(i).getAmount().getValue().toEngineeringString());
            data[i][5] = new Boolean(ferms.get(i).isAddAfterBoil());          
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
        
}

/*
 *   @Override
    public void addTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    }
 */



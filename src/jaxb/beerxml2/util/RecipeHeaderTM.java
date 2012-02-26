/**
 *  
 */
package jaxb.beerxml2.util;

import jaxb.beerxml2.*;
import javax.swing.table.AbstractTableModel;

/**
 * @author nate
 *
 */
@SuppressWarnings("serial")
public class RecipeHeaderTM extends AbstractTableModel {
    
    String titles[] = new String[] {
            "Name", "Type", "Author", "Created"    
    };
    
    Class<?> types[] = new Class[] {
            String.class, String.class, String.class, String.class
        };
    
    Object data[][];

    /**
     * Default Constructor
     */
    public RecipeHeaderTM() {
        // TODO Auto-generated constructor stub
    }

    public RecipeHeaderTM(RecipeType r) {
        setRecipe(r);
    }
    
    /* - Overridden base methods - */
    public int getColumnCount() { return titles.length; }
    public int getRowCount() { return data.length; }
    public String getColumnName(int c) { return titles[c]; }
    public Class<?>  getColumnClass(int c) { return types[c]; }
    public boolean isCellEditable(int row, int col) { return true; }
    
    public void setRecipe(RecipeType recipe) {
        
        data = new Object[1][4];
        
        data[0][0] = recipe.getName();
        data[0][1] = recipe.getType();
        data[0][2] = recipe.getAuthor();
        data[0][3] = recipe.getCreated();
        
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

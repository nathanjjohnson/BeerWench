/**
 * This class encapsulates a cell edit command, i.e., this class will perform 
 * all the actions necessary to both execute and undo a cell edit by a user.
 */
package beerwench.beerxml2.viewer;

import javax.swing.table.TableModel;
import java.util.logging.*;

/**
 * @author nate
 *
 */
public class CellEditCommand implements Command {

	private static Logger logger = Logger.getLogger(CellEditCommand.class.getName());
    private Object previousValue;    
    private BeerXml2FilePanel filePanel;
    private int row, col;
    private TableModel tableModel;
    
    public CellEditCommand(BeerXml2FilePanel fp, TableModel tm,
                           int r, int c) {
    	
    	logger.log(Level.FINER, "Created CellEditCommand object");
        filePanel = fp;
        tableModel = tm;
        row = r;
        col = c;
        
    }
    
    /* (non-Javadoc)
     * @see beerwench.beerxml2.viewer.Command#execute()
     */
    @Override
    public void execute() {
        // TODO Auto-generated method stub
        // 1 - Retrieve the previous value from BeerXml in filePanel
        // 2 - Set the new value
        
        
    }
    /* (non-Javadoc)
     * @see beerwench.beerxml2.viewer.Command#undo()
     */
    @Override
    public void undo() {
        // TODO Auto-generated method stub
        
        
    }

}

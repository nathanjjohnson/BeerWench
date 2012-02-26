/**
 * 
 */
package beerwench.beerxml2.viewer;

/**
 * @author nate
 *
 */
public interface Command {
    public void execute();
    public void undo();
}

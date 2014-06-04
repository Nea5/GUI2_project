package control;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import view.DrawPanel;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class UndoAction extends AbstractAction{

	private static final long serialVersionUID = 1L;

	/**
	 * Fetches the previous variables 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		double[] x = UndoRedo.stashgetter();
		   
		DrawPanel.setSmallRadius(x[0]);
		DrawPanel.setBigRadius(x[1]);
		DrawPanel.setPenhole(x[2]);
		DrawPanel.setNewX(x[3]);
		DrawPanel.setNewY(x[4]);
		
		
		
		
		
	}

}

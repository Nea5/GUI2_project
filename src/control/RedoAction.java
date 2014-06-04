package control;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import view.DrawPanel;

public class RedoAction extends AbstractAction{

	/**
	 * @author Marcus Enderskog
	 * @author Luis Mauricio
	 * @author Jonas Rosenlind
	 * @author Linnea Sandelin
	 */
	
	private static final long serialVersionUID = 1L;

	/**
	 * Perform the undo action by applying the previous variables.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
			
			double[] x = UndoRedo.performRedo();
			DrawPanel.setSmallRadius(x[0]);
			DrawPanel.setBigRadius(x[1]);
			DrawPanel.setPenhole(x[2]);
			DrawPanel.setNewX(x[3]);
			DrawPanel.setNewY(x[4]);
		
	}

}

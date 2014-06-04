package control;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.Config;
import view.DrawPanel;

public class MoveAction extends AbstractAction {

	/**
	 * @author Marcus Enderskog
	 * @author Luis Mauricio
	 * @author Jonas Rosenlind
	 * @author Linnea Sandelin
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Get the new coordinates for the drawing area. Stores the current ones.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
			double tempX = Double.parseDouble(Config.newX.getText());
			double tempY = Double.parseDouble(Config.newY.getText());
			
			DrawPanel.setNewX(tempX);
			DrawPanel.setNewY(tempY);
			
			UndoRedo.stash();

			}
		catch(NumberFormatException n){
			Config.changeLocationButton.setSelected(false);
		}
		
	}

}

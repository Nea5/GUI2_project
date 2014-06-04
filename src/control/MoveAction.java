package control;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.Config;
import view.DrawPanel;

public class MoveAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		try{

			double tempX = Double.parseDouble(Config.newX.getText());
			double tempY = Double.parseDouble(Config.newY.getText());
			System.out.println("BEND OVER TO YOUR FRONT, TOUCH YA TOES");
			
			DrawPanel.setNewX(tempX);
			DrawPanel.setNewY(tempY);
			
			UndoRedo.stash();

			}
		catch(NumberFormatException n){
			Config.changeLocationButton.setSelected(false);

			System.out.println("No number! Move manually");
	/*		double tempX = DrawPanel.getMouseX();
			double tempY = DrawPanel.getMouseY();
			[[XVÄRVDE, YVÄRDE, 2 fält till], 
		    fun(x1 x2 s 
			DrawPanel.setNewX(tempX);
			DrawPanel.setNewY(tempY);	*/
			
			
		}
		
	}

}

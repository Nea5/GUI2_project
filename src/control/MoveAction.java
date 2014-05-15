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
		
			DrawPanel.setNewX(tempX);
			DrawPanel.setNewY(tempY);	
			}
		catch(NumberFormatException n){
			System.out.println("Not a number");
		}
		
	}

}

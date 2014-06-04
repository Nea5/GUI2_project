package control;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.DrawPanel;

import graphics.Line;

public class RedoAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			System.out.println("Redo");
			
			double[] x = UndoRedo.performRedo();
			DrawPanel.setSmallRadius(x[0]);
			DrawPanel.setBigRadius(x[1]);
			DrawPanel.setPenhole(x[2]);
			DrawPanel.setNewX(x[3]);
			DrawPanel.setNewY(x[4]);
		
		
		   
		
		//Line.setRedo();
		
	}

}

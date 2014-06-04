package control;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.AbstractAction;

import view.DrawPanel;
import graphics.Line;

public class UndoAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("SKIT SKIT, motterfycker");


	//	List<Double> temp = UndoRedo.stashgetter();
//		System.out.println(temp.toString());

		double[] x = UndoRedo.stashgetter();
		   
		DrawPanel.setSmallRadius(x[0]);
		DrawPanel.setBigRadius(x[1]);
		DrawPanel.setPenhole(x[2]);
		DrawPanel.setNewX(x[3]);
		DrawPanel.setNewY(x[4]);
		
		
		
		
		
	}

}

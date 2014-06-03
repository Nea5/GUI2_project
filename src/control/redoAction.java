package control;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import graphics.Line;

public class redoAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Line.setRedo();
		
	}

}

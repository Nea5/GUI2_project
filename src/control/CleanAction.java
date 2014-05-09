package control;

import graphics.Line;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class CleanAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		Line.emptyArray();
	}

}

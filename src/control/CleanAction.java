package control;

import graphics.Line;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class CleanAction extends AbstractAction {

	private static final long serialVersionUID = 1L;

	/**
	 * Empty the array that draws the line
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Line.eraseLine();
	}

}

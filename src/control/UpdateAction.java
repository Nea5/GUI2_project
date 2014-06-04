package control;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import view.Config;
import view.DrawPanel;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class UpdateAction extends AbstractAction{

	private static final long serialVersionUID = 1L;

	/**
	 *  Updates the variables entered in the interface. Stores the previous ones.
	 */
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		DrawPanel.setBigRadius(Config.getBigvalue());
		DrawPanel.setSmallRadius(Config.getSmallvalue());
		DrawPanel.setPenhole(Config.getPenhole());
		UndoRedo.stash();
	}

}

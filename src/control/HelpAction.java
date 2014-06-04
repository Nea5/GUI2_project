package control;

import graphics.Circles;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.Config;
import view.MainView;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */
public class HelpAction extends AbstractAction {

	/**
	 * Displays the tooltips
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if("Help".equals(((JButton) e.getSource()).getActionCommand())) {
			MainView.glass.setVisible(true);
		} else if (MainView.glass.isVisible() && "Hide ToolTips".equals(((JButton) e.getSource()).getActionCommand())) {
			MainView.glass.setVisible(false);

		}
	}
	
}
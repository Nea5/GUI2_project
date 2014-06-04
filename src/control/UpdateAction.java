package control;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.Config;
import view.DrawPanel;

public class UpdateAction extends AbstractAction{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		DrawPanel.setBigRadius(Config.getBigvalue());
		DrawPanel.setSmallRadius(Config.getSmallvalue());
		DrawPanel.setPenhole(Config.getPenhole());
		UndoRedo.stash();
	}

}

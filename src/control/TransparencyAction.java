package control;

import graphics.Circles;

import javax.swing.JButton;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.Config;

public class TransparencyAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void actionPerformed(ActionEvent e) {
		if("Large".equals(((JButton) e.getSource()).getActionCommand())) {
			if(Circles.getLargeVisibility() == 1.0){
				Circles.setLargeVisibility((float)0.0);
				Config.showLargeRing.setText("Show large circle");
			} else {
				Circles.setLargeVisibility((float)1.0);
				Config.showLargeRing.setText("Hide large circle");
			}
			
		} else{
				if(Circles.getSmallVisibility() == 1.0){
					Circles.setSmallVisibility((float)0.0);
					Config.showSmallRing.setText("Show small circle");
				} else {
					Circles.setSmallVisibility((float)1.0);
					Config.showSmallRing.setText("Hide small circle");

				}
			}
			
	}

}

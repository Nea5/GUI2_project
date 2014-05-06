package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Update extends JPanel implements ActionListener{

	JPanel update = new JPanel();
	
	private JButton updateButton;
	
	public Update()
	{
		updateButton = new JButton("Update");
		updateButton.addActionListener(this);
		updateButton.setActionCommand("disable");
		//showSmallRing.setBounds(10,20,10,20);
		this.add(updateButton);
		updateButton.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("disable".equals(e.getActionCommand()))
		{
		updateButton.setEnabled(true);
		System.out.println("update");
		DrawPanel.setBigRadius(Config.getBigvalue());
		DrawPanel.setSmallRadius(Config.getSmallvalue());
		DrawPanel.setPenhole(Config.getPenhole());
		//System.out.println("new big radius: " + Config.getBigvalue());
		//System.out.println("new penhole distance: " + Config.getPenhole());
		//System.out.println("new small radius: " + Config.getSmallvalue());
		}else
		{
			
			updateButton.setEnabled(true);
		}
	}
	
	

}


package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class controllPanel extends JPanel implements ActionListener{

	JPanel controlPanel = new JPanel();
	
	private JButton showSmallRing;
	private JButton showLargeRing;
	
	public controllPanel()
	{
		showSmallRing = new JButton("Show small ring");
		showSmallRing.addActionListener(this);
		showSmallRing.setActionCommand("disable");
		showLargeRing = new JButton("Show large ring");
		showLargeRing.addActionListener(this);
		showLargeRing.setActionCommand("disable");
		//showSmallRing.setBounds(10,20,10,20);
		this.add(showLargeRing);
		this.add(showSmallRing);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("disable".equals(e.getActionCommand()))
		{
		showSmallRing.setEnabled(true);
		
		}else
		{
			showSmallRing.setEnabled(true);
		}
	}
	
	

}
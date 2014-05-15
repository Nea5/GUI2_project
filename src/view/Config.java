package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import control.CleanAction;
import control.MoveAction;
import control.TransparencyAction;


public class Config extends JComponent implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel config = new JPanel();
	public static JButton showSmallRing = new JButton("Show small ring");
	public static JButton showLargeRing = new JButton("Show large ring");
	private JButton updateButton = new JButton("Update");
	public static JButton cleanButton = new JButton();
	public static JButton changeLocationButton = new JButton();
	static JTextField smallRadius = new JTextField("",3);
	static JTextField bigRadius = new JTextField("",3);
	static JTextField penhole = new JTextField("",3);
	JLabel enterSmall = new JLabel("Enter small radius: ");
	JLabel enterBig = new JLabel("Enter big radius: ");
	JLabel enterPenhole = new JLabel("Enter penhole distance: ");
	TransparencyAction transAct = new control.TransparencyAction();
	public static JTextField newX = new JTextField("",3);
	public static JTextField newY = new JTextField("",3);
	JLabel enterNewX = new JLabel("Enter new x coordinate: ");
	JLabel enterNewY = new JLabel("Enter new y coordinate: ");
	CleanAction cleanAct = new control.CleanAction();
	MoveAction moveAct = new control.MoveAction();
	
	public Config(){
		config.setPreferredSize(new Dimension(100, 100));
	}
	
	public JComponent addParam(){
		
		
		config.add(enterSmall);
		config.add(smallRadius);
		config.add(enterBig);
		config.add(bigRadius);
		config.add(enterPenhole);
		config.add(penhole);		
		config.add(showLargeRing);
		config.add(showSmallRing);
		config.add(updateButton);
		
		updateButton.addActionListener(this);
		updateButton.setActionCommand("disable");
		//showSmallRing.setBounds(10,20,10,20);
		//this.add(updateButton);
		//updateButton.setVisible(true);

		config.add(cleanButton);	
		config.add(enterNewX);
		config.add(newX);
		config.add(enterNewY);
		config.add(newY);
		config.add(changeLocationButton);
		showLargeRing.setAction(transAct);
		showLargeRing.setActionCommand("Large");
		showLargeRing.setText("Hide large circle");
		showSmallRing.setAction(transAct);
		showSmallRing.setText("Hide small circle");
		cleanButton.setAction(cleanAct);
		cleanButton.setText("Erase line");
		changeLocationButton.setAction(moveAct);
		changeLocationButton.setText("Change location for spirograph");

		return config;
	}

	public static Double getSmallvalue(){
		
		try{
			double input = Double.parseDouble(smallRadius.getText());
			
			if(input <= 0.0){
				return 0.0;
			}
			
			else{
				return input;
			}
		}
			catch(NumberFormatException n){
				return 0.0;
			}
			
		}
		
	
	public static Double getBigvalue(){
		
		try{
			double input = Double.parseDouble(bigRadius.getText());
			
			if(input <= 0.0){
				return 0.0;
			}
			else{
				return input;
			}
		}
		catch(NumberFormatException n){
			return 0.0;
		}
	}
		
		
	
	public static Double getPenhole(){
		
		try{
			double input = Double.parseDouble(penhole.getText());
			
			if(input <= 0.0){
				return 0.0;
			}
			else{
				return input;
			}
		}
		catch(NumberFormatException n){
			return 0.0;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if("disable".equals(e.getActionCommand()))
		{
		updateButton.setEnabled(true);
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



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
import javax.swing.JToggleButton;

import control.CleanAction;
import control.HelpAction;
import control.MoveAction;
import control.TransparencyAction;
import control.UndoAction;
import control.UndoRedo;


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
	public static JToggleButton changeLocationButton = new JToggleButton();
	public static JButton redoLine = new JButton("redo");
	public static JButton undoLine = new JButton("undo");
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
	UndoAction undoAct = new control.UndoAction();
	
	public static JButton helpGlassButton = new JButton();
	HelpAction glassHelpAct = new control.HelpAction();
	
	public Config(){
		
		
		
		config.setPreferredSize(new Dimension(100, 100));
	}
	
	public JComponent addParam(){
		smallRadius.setToolTipText("Enter the new radius for the small circle here, then press 'Update' to see changes");
		bigRadius.setToolTipText("Enter the new radius for the large circle here, then press 'Update' to see changes");
		penhole.setToolTipText("Enter the new distance between the penhole and origo for the small circle here, then press 'Update' to see changes");
		newX.setToolTipText("Enter the new x coordinate indicating where to move the spirograph, then press 'Change location for spirograph' to see changes");
		newY.setToolTipText("Enter the new y coordinate indicating where to move the spirograph, then press 'Change location for spirograph' to see changes");
		
		showLargeRing.setToolTipText("Press here to hide the large circle");
		showSmallRing.setToolTipText("Press here to hide the small circle");
		
		
		
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
		updateButton.setActionCommand("update");
		
		redoLine.addActionListener(this);
		redoLine.setActionCommand("redo");
		
		undoLine.addActionListener(this);
		undoLine.setActionCommand("undo");
		//showSmallRing.setBounds(10,20,10,20);
		//this.add(updateButton);
		//updateButton.setVisible(true);

		config.add(cleanButton);	
		config.add(enterNewX);
		config.add(newX);
		config.add(enterNewY);
		config.add(newY);
		config.add(changeLocationButton);
		config.add(redoLine);
		config.add(undoLine);
		showLargeRing.setAction(transAct);
		showLargeRing.setActionCommand("Large");
		showLargeRing.setText("Hide large circle");
		showSmallRing.setAction(transAct);
		showSmallRing.setText("Hide small circle");
		cleanButton.setAction(cleanAct);
		cleanButton.setText("Erase line");
		changeLocationButton.setAction(moveAct);
		changeLocationButton.setText("Change location for spirograph");
		undoLine.setAction(undoAct);
		undoLine.setText("undo");
		
		helpGlassButton.setToolTipText("Press here to get tooltips");
		helpGlassButton.setAction(glassHelpAct);
		helpGlassButton.setActionCommand("Help");
		helpGlassButton.setText("Show tooltips");
		config.add(helpGlassButton);
		
		
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
		System.out.println("WOOOOOW");
		
		if("update".equals(e.getActionCommand()))
		{
		updateButton.setEnabled(true);
		DrawPanel.setBigRadius(Config.getBigvalue());
		DrawPanel.setSmallRadius(Config.getSmallvalue());
		DrawPanel.setPenhole(Config.getPenhole());
		
		//System.out.println("new big radius: " + Config.getBigvalue());
		//System.out.println("new penhole distance: " + Config.getPenhole());
		
		//System.out.println("new small radius: " + Config.getSmallvalue());
		UndoRedo.stash();
		}else
		{
			
			updateButton.setEnabled(true);
		}
	}
}



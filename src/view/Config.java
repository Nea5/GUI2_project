package view;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Config extends JComponent{

	JPanel config = new JPanel();
	static JTextField smallRadius = new JTextField("",3);
	static JTextField bigRadius = new JTextField("",3);
	static JTextField penhole = new JTextField("",3);
	JLabel enterSmall = new JLabel("Enter small radius: ");
	JLabel enterBig = new JLabel("Enter big radius: ");
	JLabel enterPenhole = new JLabel("Enter penhole distance: ");
	
	public Config(){
		
	}
	public JComponent test(){
		config.add(enterSmall);
		config.add(smallRadius);
		config.add(enterBig);
		config.add(bigRadius);
		config.add(enterPenhole);
		config.add(penhole);		
		
		return config;
	}

	public static Double getSmallvalue(){
		double updatedSmallRadius = Double.parseDouble(smallRadius.getText());
		return updatedSmallRadius;
	}
	
	public static Double getBigvalue(){
		double updatedBigRadius = Double.parseDouble(bigRadius.getText());
		return updatedBigRadius;
	}
	
	public static Double getPenhole(){
		double updatedPenhole = Double.parseDouble(penhole.getText());
		return updatedPenhole;
	}
}



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
	
	public Config(){}
	
	public JComponent addParam(){
		config.add(enterSmall);
		config.add(smallRadius);
		config.add(enterBig);
		config.add(bigRadius);
		config.add(enterPenhole);
		config.add(penhole);		
		
		return config;
	}

	public static Double getSmallvalue(){
		
		if("".equals(smallRadius.getText())){
			return 0.0;
		}
		else if(Double.parseDouble(smallRadius.getText()) <= 0.0){
			System.out.println("fel");
			return 0.0;
		}
		else{
			double updatedSmallRadius = Double.parseDouble(smallRadius.getText());
			return updatedSmallRadius;
		}
	}
	
	public static Double getBigvalue(){
		
		if("".equals(bigRadius.getText())){
			return 0.0;
		}	
		else if(Double.parseDouble(bigRadius.getText()) <= 0.0){
			System.out.println("fel");
			return 0.0;
		}
		else{
			double updatedBigRadius = Double.parseDouble(bigRadius.getText());
			return updatedBigRadius;
			}
		}
	
	public static Double getPenhole(){
		
		if("".equals(penhole.getText())){
			return 0.0;
		}
		else if(Double.parseDouble(penhole.getText()) <= 0.0){
			System.out.println("fel");
			return 0.0;
		}
		else{
			double updatedPenhole = Double.parseDouble(penhole.getText());
			return updatedPenhole;
		}
	}
}



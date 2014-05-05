package view;

import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

public class Config extends JComponent{

	JPanel config = new JPanel();
	
	public Config(){
		test();
	}
	public JComponent test(){
		config.add(new JCheckBox("radieStor"));
		config.add(new JCheckBox("radieLiten"));
		
		return config;
	}

}



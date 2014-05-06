package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainView extends JFrame {
JPanel content = new JPanel();
Config test = new Config();

	public MainView() {
		
		
		content.setLayout(new BorderLayout());
		
		//content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content.add(new DrawPanel(), BorderLayout.WEST);
		content.add(test.test(), BorderLayout.PAGE_START);
		//content.setBorder(BorderFactory.createLineBorder(Color.RED));
		content.add(new controllPanel(), BorderLayout.EAST);
		content.add(new Update(), BorderLayout.PAGE_END);
		setContentPane(content);
		pack();
	}




}
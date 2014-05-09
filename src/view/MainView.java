package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainView extends JFrame /*implements ActionListener*/{
JPanel content = new JPanel();
Config config = new Config();

	public MainView() {
		
		
		content.setLayout(new BorderLayout());
		
		//content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content.add(new DrawPanel(), BorderLayout.WEST);
		content.add(config.addParam(), BorderLayout.PAGE_START);
		//content.setBorder(BorderFactory.createLineBorder(Color.RED));
		content.add(new Update(), BorderLayout.PAGE_END);
		
		setContentPane(content);
		pack();
	}



}
package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class MainView extends JFrame {
JPanel content = new JPanel();

	public MainView() {
		content.setLayout(new BorderLayout());
		//content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content.add(new DrawPanel(), BorderLayout.WEST);
		//content.setBorder(BorderFactory.createLineBorder(Color.RED));
		content.add(new controllPanel(), BorderLayout.EAST);
		setContentPane(content);
		pack();
	}

}
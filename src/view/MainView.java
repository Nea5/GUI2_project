package view;

import graphics.Themes;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import control.UndoRedo;


@SuppressWarnings("serial")
public class MainView extends JFrame /*implements ActionListener*/{
JPanel content = new JPanel();
Config config = new Config();

	public MainView() {
		
		Themes.setLocalTheme(this);
		content.setLayout(new BorderLayout());
		
		//content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content.add(new DrawPanel(), BorderLayout.WEST);
		content.add(config.addParam(), BorderLayout.PAGE_START);
		//content.setBorder(BorderFactory.createLineBorder(Color.RED));

		UndoRedo.stash();
		setContentPane(content);
		pack();
	}



}
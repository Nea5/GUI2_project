package view;

import javax.swing.SwingUtilities;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainView extends JFrame {



	public MainView() {
		this.add(new drawPanel(), BorderLayout.SOUTH);
	}

	
	//private JPanel drawPanel = (JPanel) getContentPane();
	//insert a drawed circle according to coordinates 
	



	public void initView()
	{
		//mainView.setBorder(new EmptyBorder(new Insets(400,400,300,400)));
		this.pack();
	}

}
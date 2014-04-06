package view;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainView extends JFrame{

	
	private JPanel mainPanel = (JPanel) getContentPane()	;
	//insert a drawed circle according to coordinates 
	
	


	public void initView()
	{
		//setBackground(Color.blue);
		//mainPanel.setSize(600, 600);
		mainPanel.setBorder(new EmptyBorder(new Insets(400,400,300,400)));
		this.pack();
	}

}
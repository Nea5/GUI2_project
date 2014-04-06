package view;

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
		
		mainPanel.setBorder(new EmptyBorder(new Insets(400,400,300,400)));
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
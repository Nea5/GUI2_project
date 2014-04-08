package view;

import javax.swing.SwingUtilities;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class MainView extends JFrame{

	static JFrame mainFrame;
	//static JPanel drawPanel;
	
	public void initComponents() {
		mainFrame = new JFrame("Spirograph");
	}
	
	//private JPanel drawPanel = (JPanel) getContentPane();
	//insert a drawed circle according to coordinates 
	
	


	public void initView()
	{
		
		mainFrame.setSize(400, 400);
		//mainView.setBorder(new EmptyBorder(new Insets(400,400,300,400)));
		mainFrame.pack();
		mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
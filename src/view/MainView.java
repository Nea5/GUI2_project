package view;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MainView extends JFrame {



	public MainView() {
		this.add(new DrawPanel());
		
	}

	
	//private JPanel drawPanel = (JPanel) getContentPane();
	//insert a drawed circle according to coordinates 
	



	public void initView()
	{
		//mainView.setBorder(new EmptyBorder(new Insets(400,400,300,400)));
		this.pack();
		
		}

}
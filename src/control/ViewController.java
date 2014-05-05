package control;


import java.awt.BorderLayout;


import javax.swing.JFrame;

import view.MainView;

public class ViewController {

	
	private MainView mainView;
	
	public ViewController(MainView view)
	{
		mainView = view;

	}

	
	
	public void drawView()
	{
		mainView.pack();
		mainView.setTitle("SpiroGraph");
		//mainView.setSize(400, 400);
		//mainView.setLayout(new BorderLayout());
		

		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainView.setLocationRelativeTo(null);
		mainView.setVisible(true);
	
	}
	
	
}


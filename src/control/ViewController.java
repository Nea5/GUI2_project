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
		mainView.initView();
		mainView.setTitle("SpiroGraph");
		mainView.setSize(400, 400);
		//mainView.setLayout(new FlowLayout());
		mainView.setLayout(new BorderLayout());
		mainView.setLocationRelativeTo(null);
		mainView.setVisible(true);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}


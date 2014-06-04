package control;


import java.awt.BorderLayout;


import javax.swing.JFrame;

import view.MainView;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class ViewController {

	private MainView mainView;
	
	/**
	 * Updates the main view
	 * @param view
	 */
	
	public ViewController(MainView view){
		mainView = view;
	}

	/**
	 * Draws our interface
	 */
	
	public void drawView()
	{
		mainView.pack();
		mainView.setTitle("SpiroGraph");
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainView.setLocationRelativeTo(null);
		mainView.setVisible(true);
	
	}
	
	
}


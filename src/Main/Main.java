package Main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import view.MainView;
import control.ViewController;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class Main extends JFrame{
	
	private static final long serialVersionUID = 1L;

	/**
	 * Loads up the main frame
	 * @param args
	 */
	
	public static void main (String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){
			
			public void run()
			{
				
				ViewController mainViewController = new ViewController(new MainView());
				mainViewController.drawView();	
			}
		});
		
	}
}

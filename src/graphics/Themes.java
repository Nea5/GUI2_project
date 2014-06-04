package graphics;

import java.awt.Component;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

 /**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class Themes {

	/**
	 * Applies the default theme depending of the user's system
	 * @param c
	 */
	
	public static void setLocalTheme(Component c){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){}
			SwingUtilities.updateComponentTreeUI(c);
		
	}
		
	
}

package graphics;

import java.awt.Component;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Themes {

	
	public static void setLocalTheme(Component c){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){}
			SwingUtilities.updateComponentTreeUI(c);
		
	}
		
	
}

package view;

import graphics.Themes;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import control.HelpAction;
import control.UndoRedo;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

@SuppressWarnings("serial")
public class MainView extends JFrame implements MouseListener {
	
	JPanel content = new JPanel();
	Config config = new Config();
	public static JPanel glass  = new JPanel();
	JButton hideButton = new JButton();
	HelpAction helpAct = new HelpAction();
	JLabel glassText = new JLabel("This application has been developed by Marcus Enderskog, Luis Mauricio, Jonas Rosenlind and Linnea Sandelin");
	
	/**
	 * Sets the default theme, layout, glasspane and stores our initial variables
	 */
	
	public MainView() {
		
		Themes.setLocalTheme(this);
		content.setLayout(new BorderLayout());
		content.add(new DrawPanel(), BorderLayout.WEST);
		content.add(config.addParam(), BorderLayout.PAGE_START);

		UndoRedo.stash();
		
		setContentPane(content);
		glass.setSize(content.getSize());
		//setMinimumSize(new Dimension(900, 600));
		setGlassPane(glass);
		glass.addMouseListener(this);
		glass.setOpaque(false);
		addToolTips();
		pack();
	}

	/**
	 * Adds the tooltips 
	 */
	
	public void addToolTips() {

	    glass.setVisible(false);
	    glass.setLayout(new BorderLayout());
	    hideButton.setAction(helpAct);
	    hideButton.setActionCommand("Hide ToolTips");
	    hideButton.setText("Hide tooltips");
	    glass.add(hideButton, BorderLayout.AFTER_LAST_LINE);
	    glassText.setHorizontalAlignment(JLabel.CENTER);
	    glassText.setBackground(getBackground());
	    glassText.setSize(10, 10);
	    glass.add(glassText);
	  }


	
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
package view;


import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import control.CleanAction;
import control.HelpAction;
import control.MoveAction;
import control.RedoAction;
import control.TransparencyAction;
import control.UndoAction;
import control.UpdateAction;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class Config extends JComponent{

	private static final long serialVersionUID = 1L;
	
	JPanel config = new JPanel();
	
	//Buttons
	public static JButton showSmallRing = new JButton("Show small ring");
	public static JButton showLargeRing = new JButton("Show large ring");
	private JButton cleanButton = new JButton();
	private JButton redoLine = new JButton("redo");
	private JButton undoLine = new JButton("undo");
	private JButton updateButton = new JButton("Update");
	public static JToggleButton changeLocationButton = new JToggleButton();
	public static JButton helpGlassButton = new JButton();

	//Textfields
	static JTextField smallRadius = new JTextField("",3);
	static JTextField bigRadius = new JTextField("",3);
	static JTextField penhole = new JTextField("",3);
	public static JTextField newX = new JTextField("",3);
	public static JTextField newY = new JTextField("",3);
	
	//Labels
	JLabel enterSmall = new JLabel("Enter small radius: ");
	JLabel enterBig = new JLabel("Enter big radius: ");
	JLabel enterPenhole = new JLabel("Enter penhole distance: ");
	JLabel enterNewX = new JLabel("Enter new x coordinate: ");
	JLabel enterNewY = new JLabel("Enter new y coordinate: ");
	
	//Actions
	TransparencyAction transAct = new control.TransparencyAction();
	CleanAction cleanAct = new control.CleanAction();
	MoveAction moveAct = new control.MoveAction();
	UndoAction undoAct = new control.UndoAction();
	RedoAction redoAct = new control.RedoAction();
	UpdateAction updateAct = new control.UpdateAction();
	HelpAction glassHelpAct = new control.HelpAction();
	
	/**
	 * Sets the preferred size for the glasspane
	 */
	
	public Config(){
		
		config.setPreferredSize(new Dimension(100, 100));
	}
	
	/**
	 * Adds buttons, tooltips and actions to the panel
	 * @return JComponent representing the panel
	 */
	
	public JComponent addParam(){
		
		//Tooltips
		smallRadius.setToolTipText("Enter the new radius for the small circle here, then press 'Update' to see changes");
		bigRadius.setToolTipText("Enter the new radius for the large circle here, then press 'Update' to see changes");
		penhole.setToolTipText("Enter the new distance between the penhole and origo for the small circle here, then press 'Update' to see changes");
		newX.setToolTipText("Enter the new x coordinate indicating where to move the spirograph, then press 'Change location for spirograph' to see changes");
		newY.setToolTipText("Enter the new y coordinate indicating where to move the spirograph, then press 'Change location for spirograph' to see changes");
		showLargeRing.setToolTipText("Press here to hide the large circle");
		showSmallRing.setToolTipText("Press here to hide the small circle");
		
		//Add things to panel
		config.add(enterSmall);
		config.add(smallRadius);
		config.add(enterBig);
		config.add(bigRadius);
		config.add(enterPenhole);
		config.add(penhole);		
		config.add(showLargeRing);
		config.add(showSmallRing);
		config.add(updateButton);
		config.add(cleanButton);	
		config.add(enterNewX);
		config.add(newX);
		config.add(enterNewY);
		config.add(newY);
		config.add(changeLocationButton);
		config.add(redoLine);
		config.add(undoLine);
		config.add(helpGlassButton);
		
		//Setup actions
		showLargeRing.setAction(transAct);
		showLargeRing.setActionCommand("Large");
		showLargeRing.setText("Hide large circle");
		showSmallRing.setAction(transAct);
		showSmallRing.setText("Hide small circle");
		cleanButton.setAction(cleanAct);
		cleanButton.setText("Erase line");
		changeLocationButton.setAction(moveAct);
		changeLocationButton.setText("Change location for spirograph");
		undoLine.setAction(undoAct);
		undoLine.setText("Undo");
		updateButton.setAction(updateAct);
		updateButton.setText("Update");
		redoLine.setAction(redoAct);
		redoLine.setText("Redo");
		helpGlassButton.setToolTipText("Press here to get tooltips");
		helpGlassButton.setAction(glassHelpAct);
		helpGlassButton.setActionCommand("Help");
		helpGlassButton.setText("Show tooltips");
		
		return config;
	}

	/**
	 * Collects the new small radius entered in the interface
	 * @return the radius as a double
	 */
	
	public static Double getSmallvalue(){
		
		try{
			double input = Double.parseDouble(smallRadius.getText());
				if(input <= 0.0){
					return 0.0;
				}
				else{
					return input;
				}
		}
			catch(NumberFormatException n){
				return 0.0;
			}
			
		}
		
	/**
	 * Collects the new large radius entered in the interface
	 * @return the radius as a double
	 */
	
	public static Double getBigvalue(){
		
		try{
			double input = Double.parseDouble(bigRadius.getText());
				if(input <= 0.0){
				return 0.0;
				}
			
				else{
				return input;
				}
		}
		catch(NumberFormatException n){
			return 0.0;
		}
	}
	
	/**
	 * Collects the new penhole position entered in the interface
	 * @return the penhole as a double
	 */
	
	public static Double getPenhole(){
		
		try{
			double input = Double.parseDouble(penhole.getText());
				if(input <= 0.0){
				return 0.0;
				}
				else{
				return input;
				}
		}
		catch(NumberFormatException n){
			return 0.0;
		}
	}
	
}



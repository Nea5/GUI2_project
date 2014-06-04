package view;

import graphics.Themes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.sun.media.sound.Toolkit;
import com.sun.xml.internal.ws.api.server.Container;

import control.HelpAction;
import control.UndoRedo;


@SuppressWarnings("serial")
public class MainView extends JFrame implements MouseListener {
JPanel content = new JPanel();
Config config = new Config();
public static JPanel glass  = new JPanel();
JButton hideButton = new JButton();
HelpAction helpAct = new HelpAction();
JLabel glassText = new JLabel("This application has been developed by Marcus Enderskog, Luis Mauricio, Jonas Rosenlind and Linnea Sandelin");
	public MainView() {
		
		Themes.setLocalTheme(this);
		content.setLayout(new BorderLayout());
		
		//content.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		content.add(new DrawPanel(), BorderLayout.WEST);
		content.add(config.addParam(), BorderLayout.PAGE_START);
		//content.setBorder(BorderFactory.createLineBorder(Color.RED));

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
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class drawPanel extends JPanel {
	public drawPanel(){
		//setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	public Dimension getPreferredSize() {
		return new Dimension(100,100);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("HEJ HOPP", 20, 20);
		g.drawRect(10, 10, 5, 5);
	}
	
}
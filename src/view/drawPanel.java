package view;

import graphics.Wheels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

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
		//g.drawString("HEJ HOPP", 20, 20);
		Graphics2D g2 = (Graphics2D) g;
		//g2.draw(Wheels.wheel1);
		g2.draw(Wheels.polyline);

		//Graphics2D g2 = (Graphics2D) g;
	    //g2.draw(Wheels.wheel1);
	}
	
}
package view;

import graphics.Line;
import graphics.Wheels;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.QuadCurve2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DrawPanel extends JPanel {
	
	
	public DrawPanel(){
		this.add(new Line(0,0,400,400));
		//this.setVisible(true);
		//this.setSize(new Dimension(400, 400));
		//setBorder(BorderFactory.createLineBorder(Color.black));
		//this.add(new Line());
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
	}



	
	/*public Dimension getPreferredSize() {
		return new Dimension(100,100);
	}*/
	
	

	  
	/*public void paint(Graphics graphics)
	{
	    graphics.drawLine(10, 10, 600, 600);
	}*/
	
	
	/*public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawString("HEJ HOPP", 20, 20);
		//Graphics2D g2 = (Graphics2D) g;
		//g2.draw(new Wheels());
		
	}*/
	
}
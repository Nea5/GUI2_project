package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

import graphics.Circles;
import graphics.Line;



public class DrawPanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static double xTopLeft, yTopLeft, radiusTopLeft, xBigCenter, yBigCenter, radiusBig, xSmallCenter, ySmallCenter, radiusSmall;
	private double R = 51;
	private double r = -18;
	private double a = 47;
	private double t = 0;
	public Circles circles; 
	Timer time = new Timer(1, (ActionListener) this);
	static Line testLine= new Line(); 
	private final Color LINE_COLOR = Color.RED;
	
	public DrawPanel(){
		xTopLeft = 0;
		yTopLeft = 0;
		radiusTopLeft = 200;
		xBigCenter = xTopLeft + (radiusTopLeft/2);
		yBigCenter = yTopLeft + (radiusTopLeft/2);
		radiusBig = 200;
		radiusSmall = 100;
		xSmallCenter = xBigCenter - (radiusSmall/2);
		ySmallCenter = yBigCenter - (radiusSmall/2);
		
		
		//this.add(new Line(0,0,400,400), BorderLayout.WEST);
		this.add(circles = new Circles(xTopLeft, yTopLeft, radiusTopLeft, xSmallCenter, ySmallCenter, radiusSmall));
		this.add(new Line());
		time.start();
		//this.setVisible(true);
		//this.setSize(new Dimension(400, 400));
		//setBorder(BorderFactory.createLineBorder(Color.black));
		//this.add(new Line());
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		circles.setSmallCircleX(circles.getSmallCircle(), 1- Math.cos(t));
		circles.setSmallCircleY(circles.getSmallCircle(), 1- Math.cos(t));
		//circles.setSmallCircleX(circles.getSmallCircle() ,(R+r) * Math.cos(t) - (r+a) * Math.cos(((R+r)/r)*t));
		//circles.setSmallCircleY( circles.getSmallCircle(),(R+r) * Math.sin(t) - (r+a) * Math.sin(((R+r)/r)*t));
		t+= 0.001;
		
		repaint();
	}



	public void moveCircle(Ellipse2D.Double e, Graphics2D g, double newX, double newY){
		
		System.out.println(newX + ""+""+ newY);
		circles.updateSmallCircle(e,newX, newY);
		g.draw(e);
		
	}

	

	  
	public void paintComponent(Graphics g)
	{
	 	  super.paintComponent(g);
		  Graphics2D g2d = (Graphics2D)g;
		 
		  g2d.draw(circles.getLargeCircle());
		  g2d.draw(circles.getSmallCircle());
		  
		  g.setColor(LINE_COLOR);
		  moveCircle(circles.getSmallCircle(), g2d, circles.getSmallCircle().getX(), circles.getSmallCircle().getY());
		  testLine.addPointLine((int)circles.getSmallCircle().getCenterX(), (int)circles.getSmallCircle().getCenterY());
		  testLine.draw(g);
	         
		
	}
	
}
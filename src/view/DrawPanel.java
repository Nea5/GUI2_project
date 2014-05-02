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
	
	//static double xTopLeft, yTopLeft, radiusTopLeft, xBigCenter, yBigCenter, radiusBig, xSmallCenter, ySmallCenter, radiusSmall, origoX, origoY;
	//andrasadasd
	public Circles circles;
	
	static double width;
	static double height;
	static double x;
	static double y;
	static double R;
	static double r;
	static double origoX;
	static double origoY;
	
	static double a;
	static double k;
	static double l;
	static double p;
	static double t;
	static double yPen;
	static double xPen;
	static double xc;
	static double yc;
	static double fulhackX;
	static double fulhackY;	
	
	Timer time = new Timer(1, (ActionListener) this);
	static Line testLine= new Line(); 
	private final Color LINE_COLOR = Color.RED;
	
	public DrawPanel(){
		
		origoX = 0;
		origoY = 0;
		width = 300;
		height = width;
		R = width/2;
		r = 40;
		x = origoX + width/2;
		y = origoY + width /2;
		
		
		p = 20;
		t = 0;
		xc = x + (R - r) * Math.cos(t);
		yc = y + (R - r) * Math.sin(t);
		l = p/r;
		k = r/R;
		yPen = R*((1-k)*Math.sin(t)-l*k*Math.sin(((1-k)/k)*t));
		xPen = R*((1-k)*Math.cos(t)+l*k*Math.cos(((1-k)/k)*t));

		this.add(circles = new Circles(R*2, xc, yc, r*2));
		this.add(new Line());
		time.start();
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		

		fulhackY =y-r + R*((1-k)*Math.sin(t)-0*k*Math.sin(((1-k)/k)*t));
		fulhackX =x-r + R*((1-k)*Math.cos(t)+0*k*Math.cos(((1-k)/k)*t));
		circles.setSmallCircleX(circles.getSmallCircle(), fulhackX);
		circles.setSmallCircleY(circles.getSmallCircle(), fulhackY);
		yPen =y + R*((1-k)*Math.sin(t)-l*k*Math.sin(((1-k)/k)*t));
		xPen =x + R*((1-k)*Math.cos(t)+l*k*Math.cos(((1-k)/k)*t));
		
		
		
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
		  // g2d.draw(circles.getSmallCircle());
		  
		  g.setColor(LINE_COLOR);
		  moveCircle(circles.getSmallCircle(), g2d, circles.getSmallCircle().getX(), circles.getSmallCircle().getY());
		  testLine.addPointLine((int)xPen, (int)yPen);
		  testLine.draw(g);
	         
		
	}
	
}
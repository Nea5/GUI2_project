package view;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

import graphics.Circles;
import graphics.Line;



public class DrawPanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public Circles circles;
	
	/*Circle basic variables*/
	private static double width, height,x,y,R,r,origoX,origoY;
	
	private static double a,k,l,p,t,yPen,xPen,xc,yc,fulhackX,fulhackY;	
	
	
	Timer time = new Timer(1, (ActionListener) this);
	private Line testLine= new Line(); 
	private final Color POINT_COLOR = Color.CYAN;

	
	
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

		this.add(circles = new Circles(R*2, xc, yc, r*2, origoX, origoY));
		this.add(new Line());
		time.start();
		}

		public DrawPanel(double smallRadius, double bigRadius, double penhole){
			r = smallRadius;
			R = bigRadius/2;
			p = penhole;
		}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*Hardcoded circle movement inside the large ellipse*/
		fulhackY =y-r + R*((1-k)*Math.sin(t)-0*k*Math.sin(((1-k)/k)*t));
		fulhackX =x-r + R*((1-k)*Math.cos(t)+0*k*Math.cos(((1-k)/k)*t));
		
	

			//origoX = 0;
			//origoY = 0;
			height = width;
			R = width/2;
			//r = 70;
			x = origoX + width/2;
			y = origoY + width /2;
			
			//p = 50;
			//t = 0;
			xc = x + (R - r) * Math.cos(t);
			yc = y + (R - r) * Math.sin(t);
			l = p/r;
			k = r/R;
			yPen = R*((1-k)*Math.sin(t)-l*k*Math.sin(((1-k)/k)*t));
			xPen = R*((1-k)*Math.cos(t)+l*k*Math.cos(((1-k)/k)*t));

			this.add(circles = new Circles(R*2, xc, yc, r*2, origoX, origoY));
			
			
			
			//LINE_COLOR = Color.BLUE;
			//System.out.println("t är nu" + t );
		
		circles.setSmallCircleX(circles.getSmallCircle(), fulhackX);
		circles.setSmallCircleY(circles.getSmallCircle(), fulhackY);
		yPen =y + R*((1-k)*Math.sin(t)-l*k*Math.sin(((1-k)/k)*t));
		xPen =x + R*((1-k)*Math.cos(t)+l*k*Math.cos(((1-k)/k)*t));
		
		t+= 0.01;
		
		repaint();
	}	

	
	
	public void moveCircle(Ellipse2D.Double e, Graphics2D g, double newX, double newY){
		
		circles.updateSmallCircle(e,newX, newY);
		g.draw(e);
		
	}
	


	  
	public void paintComponent(Graphics g)
	{
	 	  super.paintComponent(g);
		  Graphics2D g2d = (Graphics2D)g;
		  
		  /* Thicker line for large circle*/
		  g2d.setStroke(new BasicStroke(2,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND ));
			
		  /*Putting Antialiasing "ON"*/
		  g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				  RenderingHints.VALUE_ANTIALIAS_ON);
		  /*Bilinear antialiasing*/
		  g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
				  RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		  
		  /*Bicubic antialiasing*/
		  //g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		  //		  RenderingHints.VALUE_INTERPOLATION_BICUBIC);

		  g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,circles.getLargeVisibility()));
		  g2d.setColor(circles.getLargeColor());
		  g2d.draw(circles.getLargeCircle());

		  g2d.setStroke(new BasicStroke(0,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND ));
		  
		  
		  /*Putting Antialiasing "OFF"*/
		  g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				  RenderingHints.VALUE_ANTIALIAS_OFF);
		  
		  g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,circles.getSmallVisibility()));

		  
		  g2d.setColor(circles.getSmallColor());
		  
		  //g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,circles.getLargeVisibility()));
		  
		  moveCircle(circles.getSmallCircle(), g2d, circles.getSmallCircle().getX(), circles.getSmallCircle().getY());

		  g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,(float) 1.0));
		  g.setColor(testLine.getColor()); // red color on the line
		  
		  /*drawing line*/
		  testLine.addPointLine((int)xPen, (int)yPen);
		  testLine.draw(g);
		  
		  /*penPointer in the small ring*/
		  g2d.setColor(POINT_COLOR);
		  g2d.setStroke(new BasicStroke(7,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND ));
		  g2d.drawLine((int)xPen, (int)yPen,(int) xPen,(int) yPen);
		  
	      g2d.dispose();   
		
	}
	
	public static void setSmallRadius(double smallRadius){
		if(smallRadius <= 0.0){}
		else{
		r = smallRadius;
		}
	}

	public static void setBigRadius(double bigRadius){
		if(bigRadius <= 0.0){}
		else{	
		width = 2*bigRadius;
		width = bigRadius*2;
		}
	}
	
	public static void setPenhole(double penhole){
		if(penhole <= 0.0){}
		else{
		p = penhole;
		}
	}
	
	public static void setNewX(double newX){
		origoX = newX;
	}
	
	public static void setNewY(double newY){
		origoY = newY;
	}
}
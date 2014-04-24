package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Circles extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static Ellipse2D.Double largeCircle;
	static Ellipse2D.Double smallCircle;
	static Line testLine= new Line(); 
	private static double angle;
	private static double step;
	private double R = 51;
	private double r = -18;
	private double a = 47;
	private double t = 0;
	private final Color LINE_COLOR = Color.RED;
	
	
	  Timer time = new Timer(1, (ActionListener) this);

	
	public Circles(double xLarge, double yLarge, double radiusLarge, double xSmall, double ySmall, double radiusSmall) {
		 largeCircle = new Ellipse2D.Double(xLarge, yLarge, radiusLarge, radiusLarge);
		 smallCircle = new Ellipse2D.Double(xSmall, ySmall, radiusSmall, radiusSmall);		
		 setPreferredSize(new Dimension(300, 300));
		 time.start();
	}
	
	private void updateCircle(Ellipse2D.Double e, double newX, double newY){
		e.x = newX;
		e.y = newY;
	}
	
	public void moveCircle(Ellipse2D.Double c, Graphics2D g, double newX, double newY){
		updateCircle(c, newX, newY);
		g.draw(c);
		
	}

	public void setX(Ellipse2D.Double e, double newX){
		e.x = newX;
	}
	
	public void setY(Ellipse2D.Double e, double newY){
		e.y = newY;
	}
	
	public void setRadius(Ellipse2D.Double e, double radius){
		e.width = radius;
		e.height = radius;
	}
	
	public void paintComponent(Graphics g){
		  super.paintComponent(g);
		  Graphics2D g2d = (Graphics2D)g;
		 
		  g2d.draw(largeCircle);
		  g2d.draw(smallCircle);
		  
		  g.setColor(LINE_COLOR);
		  moveCircle(smallCircle, g2d, smallCircle.getX(), smallCircle.getY());
		  testLine.addPointLine((int)smallCircle.getCenterX(), (int)smallCircle.getCenterY());
		  testLine.draw(g);
	         
		  
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		
		setX(smallCircle, (R+r) * Math.cos(t) - (r+a) * Math.cos(((R+r)/r)*t));
		setY(smallCircle, (R+r) * Math.sin(t) - (r+a) * Math.sin(((R+r)/r)*t));
		t+= 0.001;
		
		repaint();
	
		
	}

	public static double getAngle() {
		return angle;
	}

	public static void setAngle(double angle) {
		Circles.angle = angle;
	}

	public static double getStep() {
		return step;
	}

	public static void setStep(double step) {
		Circles.step = step;
	}

}

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

public class Circles extends JPanel{
	
	/**
	 * change for commit
	 */
	private static final long serialVersionUID = 1L;
	
	public static Ellipse2D.Double largeCircle;
	public static Ellipse2D.Double smallCircle; 
	private static double angle;
	private static double step;
	


	public Circles(double R, double smallX, double smallY, double r){
		largeCircle = new Ellipse2D.Double(0, 0, R, R);
		smallCircle = new Ellipse2D.Double(smallX, smallY, r, r);
		setPreferredSize(new Dimension(1000, 1000));
	}
	
	
		
	public void updateSmallCircle(Ellipse2D.Double e, double newX, double newY){
		e.x = newX;
		e.y = newY;
	}
	
	

	public void setSmallCircleX(Ellipse2D.Double e,double newX){
		 e.x = newX;
	}
	
	public void setSmallCircleY(Ellipse2D.Double e,double newY){
		e.y = newY;
	}
	
	public void setRadius(Ellipse2D.Double e, double radius){
		e.width = radius;
		e.height = radius;
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
	public Ellipse2D.Double getSmallCircle()
	{
		return smallCircle;
	}
	
	public Ellipse2D.Double getLargeCircle()
	{
		return largeCircle;
	}

}

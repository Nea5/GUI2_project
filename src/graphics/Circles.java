package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Circles extends JPanel{
	
	/**
	 * change for commit
	 */
	private static final long serialVersionUID = 1L;
	
	private Ellipse2D.Double largeCircle;
	private Ellipse2D.Double smallCircle; 
	
	private Color SMALL_CIRCLE_COLOR = Color.BLACK;	
	private Color LARGE_CIRCLE_COLOR = Color.BLACK;	
	private float largeVisibility = (float) 1.0;
	private float smallVisibility = (float) 1.0;
	
	/*
	 * TODO remove this along with below methods?
	 * 
	private static double angle;
	private static double step;
	*/


	public Circles(double R, double smallX, double smallY, double r){
		largeCircle = new Ellipse2D.Double(0, 0, R, R);
		smallCircle = new Ellipse2D.Double(smallX, smallY, r, r);
		setPreferredSize(new Dimension(1000, 1000));
	}
	
	public void setLargeVisibility(float nr)
	{
		largeVisibility = nr;
	}
	
	public float getLargeVisibility()
	{
		return largeVisibility;
	}
	
	
	public void setSmallVisibility(float nr)
	{
		smallVisibility = nr;
	}
	
	public float getSmallVisibility()
	{
		return smallVisibility;
	}
	
	public void setLargeColor(Color newColor)
	{
		SMALL_CIRCLE_COLOR = newColor;
	}
	
	public Color getLargeColor()
	{
		return SMALL_CIRCLE_COLOR;
	}
	
	public void setSmallColor(Color newColor)
	{
		LARGE_CIRCLE_COLOR = newColor;
	}
	
	public Color getSmallColor()
	{
		return LARGE_CIRCLE_COLOR;
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
	
	/*
	 * TODO
	 * What did we want with this, remove it?*/
	/*
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
	*/
	
	public Ellipse2D.Double getSmallCircle()
	{
		return smallCircle;
	}
	
	public Ellipse2D.Double getLargeCircle()
	{
		return largeCircle;
	}

}

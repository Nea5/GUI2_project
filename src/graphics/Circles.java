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
	private static float largeVisibility = (float) 1.0;
	private static float smallVisibility = (float) 1.0;
	


	public Circles(double R, double smallX, double smallY, double r, double largeX, double largeY){
		largeCircle = new Ellipse2D.Double(largeX, largeY, R, R);
		smallCircle = new Ellipse2D.Double(smallX, smallY, r, r);
		setPreferredSize(new Dimension(1000, 1000));
	}
	
	public static void setLargeVisibility(float nr)
	{
		largeVisibility = nr;
	}
	
	public static float getLargeVisibility()
	{
		return largeVisibility;
	}
	
	
	public static void setSmallVisibility(float nr)
	{
		smallVisibility = nr;
	}
	
	public static float getSmallVisibility()
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

	
	public Ellipse2D.Double getSmallCircle()
	{
		return smallCircle;
	}
	
	public Ellipse2D.Double getLargeCircle()
	{
		return largeCircle;
	}

}

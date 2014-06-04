package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class Circles extends JPanel{
	
	/**
	 * @author Marcus Enderskog
	 * @author Luis Mauricio
	 * @author Jonas Rosenlind
	 * @author Linnea Sandelin
	 */
	
	private static final long serialVersionUID = 1L;
	private Ellipse2D.Double largeCircle;
	private Ellipse2D.Double smallCircle; 
	private Color SMALL_CIRCLE_COLOR = Color.BLACK;	
	private Color LARGE_CIRCLE_COLOR = Color.BLACK;	
	private static float largeVisibility = (float) 1.0;
	private static float smallVisibility = (float) 1.0;
	
	/**
	 * Template for creating both circles in Ellipse2D
	 * 
	 * @param R
	 * @param smallX
	 * @param smallY
	 * @param r
	 * @param largeX
	 * @param largeY
	 */
	
	public Circles(double R, double smallX, double smallY, double r, double largeX, double largeY){
		largeCircle = new Ellipse2D.Double(largeX, largeY, R, R);
		smallCircle = new Ellipse2D.Double(smallX, smallY, r, r);
		setPreferredSize(new Dimension(1000, 1000));
	}
	
	/**
	 *  Sets the level of transparency of the large circle
	 * @param nr
	 */
	
	public static void setLargeVisibility(float nr)
	{
		largeVisibility = nr;
	}
	
	/**
	 * Determines whether the large circle is visible or not
	 * @return 
	 */
	
	public static float getLargeVisibility()
	{
		return largeVisibility;
	}
	
	/**
	 * Sets the level of transparency of the small circle
	 * @param nr
	 */
	public static void setSmallVisibility(float nr)
	{
		smallVisibility = nr;
	}
	
	/**
	 * Determines whether the small circle is visible or not
	 * @return 
	 */
	
	public static float getSmallVisibility()
	{
		return smallVisibility;
	}
	
	/**
	 * Sets the color of the small circle
	 * @param newColor
	 */
	
	public void setLargeColor(Color newColor)
	{
		SMALL_CIRCLE_COLOR = newColor;
	}
	
	/**
	 * Fetches the color of the large circle
	 * @param newColor
	 */
	
	public Color getLargeColor()
	{
		return SMALL_CIRCLE_COLOR;
	}
	
	/**
	 * Sets the color of the small circle
	 * @param newColor
	 */
	
	public void setSmallColor(Color newColor)
	{
		LARGE_CIRCLE_COLOR = newColor;
	}
	
	/**
	 * Fetches the color of the small circle
	 * @param newColor
	 */
	
	public Color getSmallColor()
	{
		return LARGE_CIRCLE_COLOR;
	}
	
	/**
	 * Updates both coordinates of the small circle
	 * 
	 * @param e
	 * @param newX
	 * @param newY
	 */
	public void updateSmallCircle(Ellipse2D.Double e, double newX, double newY){
		e.x = newX;
		e.y = newY;
	}
	
	/**
	 * Updates the x coordinate of the small circle
	 * 
	 * @param e
	 * @param newX
	 */
	
	public void setSmallCircleX(Ellipse2D.Double e,double newX){
		 e.x = newX;
	}
	
	/**
	 * Updates the y coordinate of the small circle
	 * 
	 * @param e
	 * @param newX
	 */
	
	public void setSmallCircleY(Ellipse2D.Double e,double newY){
		e.y = newY;
	}
	
	/**
	 * Updates the radius of the small circle
	 * 
	 * @param e
	 * @param newX
	 */
	
	public void setRadius(Ellipse2D.Double e, double radius){
		e.width = radius;
		e.height = radius;
	}

	/**
	 * Fetches the small circle
	 * @return an Ellipse2D object representing the small circle
	 */
	
	public Ellipse2D.Double getSmallCircle()
	{
		return smallCircle;
	}
	
	/**
	 * Fetches the large circle
	 * @return an Ellipse2D object representing the large circle
	 */
	
	public Ellipse2D.Double getLargeCircle()
	{
		return largeCircle;
	}

}

package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JPanel;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class Line extends JPanel{

	private static final long serialVersionUID = 1L;
	private Color LINE_COLOR = Color.RED;
	private static List<Integer> xList, yList, oldXList, oldYList, redoXList, redoYList;	
	private BufferedImage canvas = new BufferedImage(3,3, BufferedImage.TYPE_INT_ARGB);
	
	/**
	 * Sets up the storage for the x and y coordinates
	 */
	
	public Line()
	{
		xList = new ArrayList<Integer>();
		yList = new ArrayList<Integer>();
	}

	/**
	 * Sets up the storage for the x and y coordinates and sets initial values
	 * @param x
	 * @param y
	 */
	public Line(int x, int y)
	{
		xList = new ArrayList<Integer>();
		yList = new ArrayList<Integer>();
		xList.add(x);
		yList.add(y);
		
	}
	
	/**
	 * Add new coordinates 
	 * @param x
	 * @param y
	 */
	
	public void addPointLine(int x, int y)
	{
		xList.add(x);
		yList.add(y);
	}
	
	/**
	 * Draws the coordinates 
	 * @param g
	 */
	
	public void draw(Graphics g) {
	     
		for (int i = 0; i < xList.size() - 1; ++i) {
			g.fillRect(xList.get(i), yList.get(i), 3, 3); 
	      }
	}
	
	/**
	 * Fetches the color of the line
	 * @return
	 */
	
	public Color getColor()
	{
		return LINE_COLOR;
	}
	
	/**
	 * Erases our previous line coordinates
	 */
	
	public static void eraseLine() {
		xList.clear();
		yList.clear();
	}
	
}
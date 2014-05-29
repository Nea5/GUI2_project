package graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/*
 * TODO Fix the memory leak, array size growing possibly 
 * reason of animation slowing down 
 */

public class Line extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Color LINE_COLOR = Color.RED;
	
	public static List<Integer> xList;
	public static List<Integer> yList;
	private BufferedImage canvas = new BufferedImage(3,3, BufferedImage.TYPE_INT_ARGB);
	
	public Line()
	{
		xList = new ArrayList<Integer>();
		yList = new ArrayList<Integer>();
	}

	public Line(int x, int y)
	{
		
		xList = new ArrayList<Integer>();
		yList = new ArrayList<Integer>();
		xList.add(x);
		yList.add(y);
		
	}
	
	
	
	public void addPointLine(int x, int y)
	{
		xList.add(x);
		yList.add(y);
		
	}
	
	public void draw(Graphics g) {
		//System.out.println("Arraysize: "+ xList.size());
	      for (int i = 0; i < xList.size() - 1; ++i) {
	    	  g.fillRect(xList.get(i), yList.get(i), 3, 3);
	    	  
	         
	      }
	}
	
	
	public void setRandomColor()
	{
		double hue = Math.random();
		int rgb = Color.HSBtoRGB((float)hue,(float)0.5,(float)0.5);
		Color newColor = new Color(rgb);
		//LINE_COLOR = newColor;
		LINE_COLOR = Color.RED;
	}
	
	public Color getColor()
	{
		return LINE_COLOR;
	}
	
	public Line getLine()
	{
		return this;
	}
	
	public static void emptyArray() {
		xList.clear();
		yList.clear();
	}

}
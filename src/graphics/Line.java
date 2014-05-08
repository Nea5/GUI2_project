package graphics;

import java.awt.Color;
import java.awt.Graphics;
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
	
	private List<Integer> xList;
	private List<Integer> yList;
	public Line()
	{
		xList = new ArrayList<Integer>();
		yList = new ArrayList<Integer>();
	}

	
	public void addPointLine(int x, int y)
	{
		xList.add(x);
		yList.add(y);
		
	}
	
	public void draw(Graphics g) {
		//System.out.println("Arraysize: "+ xList.size());
	      for (int i = 0; i < xList.size() - 1; ++i) {
	         g.drawLine(xList.get(i), yList.get(i), xList.get(i + 1),
	               yList.get(i + 1));
	      }
	}
	
	public void setColor(Color newColor)
	{
		LINE_COLOR = newColor;
	}
	public Color getColor()
	{
		return LINE_COLOR;
	}

}
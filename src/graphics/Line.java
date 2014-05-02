package graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;


public class Line extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
	      for (int i = 0; i < xList.size() - 1; ++i) {
	         g.drawLine(xList.get(i), yList.get(i), xList.get(i + 1),
	               yList.get(i + 1));
	      }
	}

}
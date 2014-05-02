package view;

import javax.swing.JPanel;

import graphics.Circles;
import graphics.Line;



public class DrawPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static double xTopLeft, yTopLeft, radiusTopLeft, xBigCenter, yBigCenter, radiusBig, xSmallCenter, ySmallCenter, radiusSmall;
	
	
	public DrawPanel(){
		xTopLeft = 0;
		yTopLeft = 0;
		radiusTopLeft = 200;
		xBigCenter = xTopLeft + (radiusTopLeft/2);
		yBigCenter = yTopLeft + (radiusTopLeft/2);
		radiusBig = 200;
		radiusSmall = 100;
		xSmallCenter = xBigCenter - (radiusSmall/2);
		ySmallCenter = yBigCenter - (radiusSmall/2);
		
		
		//this.add(new Line(0,0,400,400), BorderLayout.WEST);
		this.add(new Circles(xTopLeft, yTopLeft, radiusTopLeft, xSmallCenter, ySmallCenter, radiusSmall));
		this.add(new Line());
		//this.setVisible(true);
		//this.setSize(new Dimension(400, 400));
		//setBorder(BorderFactory.createLineBorder(Color.black));
		//this.add(new Line());
		//this.setBorder(BorderFactory.createLineBorder(Color.black));
	}






	
	/*public Dimension getPreferredSize() {
		return new Dimension(100,100);
	}*/
	
	

	  
	/*public void paint(Graphics graphics)
	{
	    graphics.drawLine(10, 10, 600, 600);
	}*/
	
	
	/*public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawString("HEJ HOPP", 20, 20);
		//Graphics2D g2 = (Graphics2D) g;
		//g2.draw(new Wheels());
		
	}*/
	
}
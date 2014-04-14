package graphics;

import java.awt.event.*;
import java.awt.geom.QuadCurve2D;
import java.awt.*;

import javax.swing.*; 

public class Line extends JPanel implements ActionListener{

/* public static void main(String[] args){
  java.awt.EventQueue.invokeLater(new Runnable() {
    public void run() {
      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(new DrawLine(150,300,350,300));
      frame.setSize(500,500);
      frame.setVisible(true);  
    }
  });  
 }*/

  static int x1;
  static int y1;
  static int x2;
  static int y2;
  static int midx;
  static int midy;

  Timer time = new Timer(10, (ActionListener) this);

  public Line(int x1, int y1, int x2, int y2){
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
    midx = (x1+x2)/2;
    midy = (y1+y2)/2;
    time.start();
    setPreferredSize(new Dimension(200, 200));
  }

  public static void animateLine(Graphics2D g, QuadCurve2D Q){
	  Q.setCurve(x1, y1, midx, midy, x2, y2);
	  g.draw(Q);
  }

  public void actionPerformed(ActionEvent arg0) {
    if(midy>123){
      midy--;
      repaint();
    }
  }
  
  public void paintComponent(Graphics newG){
	    super.paintComponent(newG);
	    QuadCurve2D q = new QuadCurve2D.Float();

	    Graphics2D g2d = (Graphics2D)newG;
	   
	    animateLine(g2d, q);
	  }

}
package graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;

import view.drawPanel;

public class Wheels extends drawPanel {
	
	//public static Graphics wheel1;
	//public static Shape wheel1;
	public GeneralPath polyline;
	
	public Wheels() {
		int x2Points[] = {0, 100, 0, 100};
		int y2Points[] = {0, 50, 50, 0};
		
		polyline = new GeneralPath(GeneralPath.WIND_EVEN_ODD, x2Points.length);

		polyline.moveTo(x2Points[0], y2Points[0]);
		
		for (int index = 1; index < x2Points.length; index++) {
	         polyline.lineTo(x2Points[index], y2Points[index]);
		};

		//wheel1 = new GeneralPath();
		
	}
}

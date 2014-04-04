package view;

import javax.swing.JFrame;

import com.sun.codemodel.internal.JLabel;

public class MainView {

	JFrame mainFrame;
	
	
	public MainView() {
		mainFrame = new JFrame("Spirograph");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainFrame.pack();
        mainFrame.setVisible(true);
	}
	
	public static void main(String[] args){
		new MainView();
	}
}

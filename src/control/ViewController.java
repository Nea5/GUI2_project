package control;

import graphics.Line;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import view.MainView;

public class ViewController {

	
	private MainView mainView;
	
	public ViewController(MainView view)
	{
		mainView = view;

	}

	
	
	public void drawView()
	{
		mainView.initView();
		mainView.setTitle("SpiroGraph");
		mainView.setSize(400, 400);
		mainView.setLayout(new FlowLayout());
		mainView.setLocationRelativeTo(null);
		mainView.setVisible(true);
		mainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
}


package control;

import view.MainView;

public class ViewController {

	
	private MainView mainView;
	
	public ViewController(MainView view)
	{
		mainView = view;

	}
	
	public void addPanels() {
		
	}
	
	public void drawView()
	{
		mainView.initView();
		mainView.setTitle("SpiroGraph");
		mainView.setLocationRelativeTo(null);
		mainView.setVisible(true);
		
		
	}
	
	
}


package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import view.DrawPanel;

/**
 * @author Marcus Enderskog
 * @author Luis Mauricio
 * @author Jonas Rosenlind
 * @author Linnea Sandelin
 */

public class UndoRedo {
	
	private static  HashMap<String, List<Double>> map = new HashMap<String, List<Double>>();	
	static List<Double> Templistan = new ArrayList();
	private static  int counter = 0;

	/**
	 * Fetches the previous variables
	 * @return a temporary list containing doubles
	 */
	public static List<Double> filler(){
		
		try{
			double x1 = DrawPanel.getSmallRadius();
			double x2 = DrawPanel.getBigRadius();
			double x3 = DrawPanel.getP();
			double x4 = DrawPanel.getLocX();
			double x5 = DrawPanel.getLocY();	
			Templistan.add(0, x1);
			Templistan.add(1, x2);
			Templistan.add(2, x3);
			Templistan.add(3, x4);
			Templistan.add(4, x5);
		
			return Templistan;
		}
		catch(Exception e){
			e.printStackTrace();
			return Templistan;
		}
	}
	
	/**
	 * Fetches the previous variables and stores them in our stash
	 */
	
	public static void stash(){
		filler();
		List<Double> tempDammit = new ArrayList<Double>();
		
		for(int u=0; u<5; u++){
			tempDammit.add(u, Templistan.get(u));
		}
	
		map.put(counter+"", tempDammit);
		counter++;
		 
	}
	
	/**
	 * Fetches the previous variables from our stash if not empty, then stores them in a temporary array
	 * @return an array of doubles
	 */
	
	public static double[] stashgetter(){
		if(counter < 2){
			double[] x1 = {map.get(counter-1 + "").get(0),map.get(counter-1 +"").get(1), map.get(counter-1 +"").get(2), map.get(counter-1 +"").get(3) ,map.get(counter-1 +"").get(4)};
			return x1; 
		}
		else{
			counter = counter-1;
			double[] x1 = {map.get(counter-1 + "").get(0),map.get(counter-1 +"").get(1), map.get(counter-1 +"").get(2), map.get(counter-1 +"").get(3) ,map.get(counter-1 +"").get(4)};
			return x1;
		}
	}

	/**
	 * Restores the next set of variables from our stash if we're not at the end
	 * @return an array of doubles
	 */
	public static double[] performRedo(){
			
			double[] restoreArray = {map.get(counter + "").get(0),map.get(counter +"").get(1), map.get(counter +"").get(2), map.get(counter +"").get(3) ,map.get(counter +"").get(4)};
			System.out.println("New small r =" + restoreArray[0]);
			if(counter < (map.size()-1)){
				counter++;
			}
			
			return restoreArray;	
	}
	
}




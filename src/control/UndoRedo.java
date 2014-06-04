package control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import view.DrawPanel;

public class UndoRedo {

	private static  HashMap<String, List<Double>> map = new HashMap<String, List<Double>>();	
	static List<Double> Templistan = new ArrayList(); // <----- lIFE SAVER 
	// The bird is not the word, the word is static
	private static  int counter = 0;
	
	public UndoRedo(){
		
	}	
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
		System.out.println("HEJ JAG FUNKArR");
		return Templistan;
		}
		catch(Exception e){
			e.printStackTrace();
			return Templistan;
		}
	}
	
	public static  void stash(){
		filler();
		
		List<Double> tempDammit = new ArrayList<Double>();
		
		for(int u=0; u<5; u++){
			tempDammit.add(u, Templistan.get(u));
		}
	
		map.put(counter+"", tempDammit);
		 counter++;
		 

		
		 for(int t = 0; t<counter; t++)
		 {
			 System.out.println(map.get(t+""));
			 
			 
			 //TAKE COUNTER -1 AND SET VARIABLES = UNDO
			 //REDO IS THEN COUNTER+1 AND SET VERIABLES = REDO
			 //POSSIBLE NEED SOME CHECKS TO SE IF THERE IS NEXT OR NOT ALSO IF NOT IS POSSIBLE TO UNDO CUZ EMPYY, murica
			 
		 }
		 
	}
	public static double[] stashgetter(){
		if(counter < 2){
			System.out.println("STOP NU ÄR DET FÖR FAAAEN NOLL");
			System.out.println("NU SKA VI SKRIVA DUBBELARRAYEN, counter är " + counter+"");
			double[] x1 = {map.get(counter-1 + "").get(0),map.get(counter-1 +"").get(1), map.get(counter-1 +"").get(2), map.get(counter-1 +"").get(3) ,map.get(counter-1 +"").get(4)};
			System.out.println("New small r =" + x1[0]);
			return x1; 
		}
		else{
		counter = counter-1;
		System.out.println("NU SKA VI SKRIVA DUBBELARRAYEN, counter är " + counter+"");
		double[] x1 = {map.get(counter-1 + "").get(0),map.get(counter-1 +"").get(1), map.get(counter-1 +"").get(2), map.get(counter-1 +"").get(3) ,map.get(counter-1 +"").get(4)};
		System.out.println("New small r =" + x1[0]);
		return x1;
		}
	}

	
	
	
	
	
	
	
	
	
	/*	[[x1 x2 x3 x4 x5], [x1 x2 x3 x4 x5]]
            ^                  ^           
            
   arraylength 
   curr = undo -1 
   redo = 
   
   
   1 2 3 4 5 
 
   1 2 3 4 5
         ^
           ^
           6 */
	
	
	
	
	
}




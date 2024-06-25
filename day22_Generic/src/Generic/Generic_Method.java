package Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_Method {

	
	// display any thing 
	public <T> void display(T msg)
	{
		System.out.println(msg);
	}
	
	
	// any type of list , not specifie
	public void GetList(ArrayList<?> arr) {
		
		for (Object a: arr) {
			System.out.println(a);
		}
	}
	
	// ? extends == upperbound (class and it children)
	public void GetNumber(ArrayList<? extends Number> arr) {
			
			for (Object a: arr) {
				System.out.println(a);
			}
		}
	
	//? super == lowerbound (class that we passed and its parent)
	public void GetFloat(ArrayList<? super Float> arr) {
		
		for (Object a: arr) {
			System.out.println(a);
		}
	}
}	

package Generic;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<String> ar1 = new ArrayList<String>();
		ArrayList<Float> ar2 = new ArrayList<Float>();
		
		/*
		 * GenericExample<String> n = new GenericExample<String>(); n.setName("Om");
		 * System.out.println(n);
		 */
		
		
		
		Generic_Method gm = new Generic_Method(); 
		//gm.display("om");
		 
		// for Integer Array
		System.out.println("\nGetList Method (Integer) : ");
		ar.add(10);
		ar.add(20);
		ar.add(30);
		gm.GetList(ar);                             // any list Like String , integer
		System.out.println(gm);
		System.out.println("\n=======================================");
		
		//for String Array
		System.out.println("\nGetList Method (String) : ");
		ar1.add("Om");
		ar1.add("keval");
		gm.GetList(ar1);                            
		System.out.println(gm);
		System.out.println("\n=======================================");
		
		// get any number like float , double etc... - upperbound
		System.out.println("\nGetNumber Method (Any Number like float,double..)) : ");
		gm.GetNumber(ar);                            // get Number like float , double
		System.out.println(gm);
		System.out.println("\n=======================================");
		
		//get only float - lowerbound
		System.out.println("\nGetFloat Method (Only Float Number) : ");
		ar2.add(10.57f);
		ar2.add(20.58f);
		ar2.add(30.47f);
		gm.GetFloat(ar2);                            // get only float
		System.out.println(gm);
	} 

}

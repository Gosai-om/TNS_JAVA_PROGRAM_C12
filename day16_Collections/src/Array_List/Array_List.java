package Array_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;



public class Array_List {
	
	public static void main(String[] args) {
	
		List<Object> l1 = new ArrayList<>();  //empty
		List<Object> l2 = new LinkedList();
		List<Object> l3 = new Vector<>();
		
		l1.add(12);
		l1.add("Om");
		System.out.println("List 1 Is : "+l1);
		
		l2.add(150);
		l2.add("Keeval");
		System.out.println("List 2 Is : "+l2);
		
		Integer i = new Integer(12);
		
		Boolean b = l1.contains(i); //check is value available or not
		System.out.println("12 Is Present In List 1 Or Not , Ans Is : "+b);
		
		System.out.println("Get Value By Index : "+l1.get(1));
		
		System.out.println("Size Of List 1 Is : "+l1.size()); //return current size
		
		// using for each
		for (Object i1 : l1) {
			System.out.println(i1);
		}
		
		
		// using iterable object
		Iterator it1 = l2.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next().toString());
		}
	}
}

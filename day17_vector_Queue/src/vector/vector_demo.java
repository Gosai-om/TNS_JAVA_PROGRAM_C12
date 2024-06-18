package vector;

import java.util.Iterator;
import java.util.Vector;

public class vector_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> animal = new Vector<>();
		animal.add("Dog");
		animal.add("Cat");
		animal.add("Lion");
		

		animal.remove(0);
		Iterator r = animal.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next().toString());
		}
		
		animal.forEach(k -> System.out.println(k));
	}
}

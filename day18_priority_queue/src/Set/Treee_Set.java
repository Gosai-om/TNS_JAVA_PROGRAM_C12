package Set;

import java.util.TreeSet;

public class Treee_Set 
{
	public static void main(String[] args) 
	{
		// can't Add Duplicate Value
		
		TreeSet<String> ts1 = new TreeSet<String>();
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		//TreeSet<Color> ts3 = new TreeSet<Color>();
		
		ts1.add("Hello");
		ts1.add("World");

		ts1.forEach(ele -> System.err.println(ele));
		
		ts2.add(20);
		ts2.add(50);
		ts2.add(80);
		ts2.add(30);
		ts2.add(40);
		ts2.add(70);
		
		System.out.println(ts2.subSet(2, 5));
		
		//ts2.forEach(ele -> System.out.println(ele));
	}
}

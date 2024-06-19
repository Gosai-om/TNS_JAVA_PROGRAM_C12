package Map;

import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Key Must be Unique Always
		TreeMap<Integer, String> stud = new TreeMap<Integer, String>();
		
		stud.put(101,"Kevla");
		stud.put(102, "Jay");
		stud.put(103, "Harsh");
		
		//System.out.println(stud);
		
		for(Integer key : stud.keySet())
		{
			System.out.println("ID : "+key+" | Name : " + stud.get(key));
		}
	}
}

package day4_Person_Country;

import day4_country.Country;
import day4_country.State;

public class DemoPerson {
	public static void main(String args[])
	{
		Country c = new Country("India");
		State s = new State("Gujarat");
		Person p = new Person("Sakshi",c,s);
	
		System.out.println(p.toString());
	}
}

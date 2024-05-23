package day4_Person_Country;

import day4_country.Country;
import day5_3_CaclculateTax.*	;
import day4_country.State;

public class DemoPerson {
	public static void main(String args[])
	{
		Country c = new Country("India");
		State s = new State("Gujarat");
		
		Person p = new Person("Sakshi",c,s,28,85000);
		
		CalculateTax tc = new CalculateTax();
		
		tc.TaxCalculation(p);
		
		System.out.println(p.toString());
	}
}

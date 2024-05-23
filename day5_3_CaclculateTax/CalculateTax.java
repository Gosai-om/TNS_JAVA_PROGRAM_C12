package day5_3_CaclculateTax;
import day4_Person_Country.*;

public class CalculateTax {

	public void TaxCalculation(Person p)
	{
		double tax=0.0;
		
		if(p.getAge() > 18)
		{
			if(p.getSal() >= 50000 && p.getSal() < 70000)
			{
				tax = p.getSal() * 0.05;
			}
			else if(p.getSal() >= 70000 && p.getSal() < 100000)
			{
				tax = p.getSal() * 0.10;
			}
			else if(p.getSal() >= 100000)
			{
				tax = p.getSal() * 0.15;
			}
			else
			{
				System.out.println("No Tax");
			}
		}
		System.out.println("PAYABLE TAX AMOUNT : "+tax);
	}
}

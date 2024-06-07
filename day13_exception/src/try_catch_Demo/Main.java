package try_catch_Demo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,result;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.print("Enter Dividend : ");
			a=sc.nextInt();

			System.out.print("Enter Divisor : ");
			b=sc.nextInt();
			
			int[] arr = {2,3,4,5,6};
			
			System.out.println("Value Of Index 5 : "+arr[5]);
			result=a/b;	
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("Error : "+ar.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("\nError : "+e.getMessage());
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}

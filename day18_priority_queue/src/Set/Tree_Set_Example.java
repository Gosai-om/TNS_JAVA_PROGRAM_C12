package Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Tree_Set_Example {
	
	public static void main(String[] args) {
		
		
		int[] numbers = new int[5];
		Scanner sc = new Scanner(System.in);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
			
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print("Enter No. "+(i+1) + " : " );
            numbers[i] = sc.nextInt();
        }
		
		System.out.println("\nEntered Number Is : ");
		for(int i=0; i<numbers.length; i++)
		{
			System.out.print(numbers[i] + ",");
			if(numbers[i] % 5 == 0)
			{
				ts.add(numbers[i]);
			}
		}
		System.out.println("\nTree Set is : "  );
		ts.forEach(ele -> System.out.println(ele));
	}
}

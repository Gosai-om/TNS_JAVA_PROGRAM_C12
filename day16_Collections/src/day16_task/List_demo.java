package day16_task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class List_demo {
	
	public static void main(String[] args) {
	
		List<Integer> l1 = new ArrayList<>();
		int odd_counter=0;
		int even_counter=0;
		
		for(int i=0; i<=20; i++)
		{
			l1.add(i);
		}
		System.out.println("Number Is : "+l1);
		
		for (Integer i1 : l1) {
			if(i1 % 2== 0){
				even_counter=even_counter+i1;
			}
			else{
				odd_counter=odd_counter+i1;
			}
		}
		System.out.println("Total Even Number Is : "+even_counter);
		System.out.println("Total Odd Number Is : "+odd_counter);
	}
}

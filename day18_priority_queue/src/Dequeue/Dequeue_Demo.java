package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq = new ArrayDeque<String>();
		
		dq.add("Honda");
		dq.add("Sizuki");
		
		dq.poll(); //remove first 
		
		dq.forEach(k -> System.out.println(k));
	}

}

package Priority_Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class City {
	public static void main(String[] args) {
		Queue<String> state = new PriorityQueue<String>();
		
		state.add("Gujarat");
		state.add("Hariyana");
		state.offer("Punjab");
		state.add("Maharashtra");
		state.add("Kerala");
		
		state.forEach(st -> System.out.println(st));
	}
}

package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class City {
	public static void main(String[] args) {
		Queue<String> state = new LinkedList<String>();
		
		state.add("Gujarat");
		state.add("Punjab");
		state.add("Maharashtra");
		state.add("Kerala");
		
		state.forEach(st -> System.out.println(st));
	}
}

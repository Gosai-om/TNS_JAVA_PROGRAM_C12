package day23_Stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		// Using Stream we can perform on operation on collection of data
		//Stream : Operation Of Collection Of data
		//Normal Stream
		Stream <Integer> no = Stream.of(10,20,30,40);
		System.out.println("Total Elemets Is : "+no.count());
		
		
		//Array Stream
		Integer[] arr = {1,2,3,4,5};
		Stream strm_arr;
		
		//Map : Perform operation on Each Elements
		strm_arr = Arrays.stream(arr).map(ele -> ele*ele);
		strm_arr.forEach(System.out::println);
	}

}

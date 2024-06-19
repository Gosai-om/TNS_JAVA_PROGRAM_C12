package Assignment;

import java.util.*;

public class ExamMarkTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List l1 = new ArrayList<>();
		
		System.out.print("How Many Size of Array You Want : ");
		int size = sc.nextInt();
		
		for(int i=1;i<=size;i++){
			System.out.print("Enter Exam "+ i + " Marks : ");
			int marks = sc.nextInt();
			l1.add(marks);
		}
		
		//System.out.println("Marks : "+l1);
		l1.forEach(i -> System.out.println("Marks : "+ i));
	}

}

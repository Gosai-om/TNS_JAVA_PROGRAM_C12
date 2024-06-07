package throw_demo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		throwDemo th = new throwDemo();
		Scanner sc = new Scanner(System.in);
		
		int mk;
		
		System.out.println("Enter Mark : ");
		mk = sc.nextInt();
		
		th.setMark(mk);
		
		System.out.println("Mark Is "+th.getMark());
	}
}

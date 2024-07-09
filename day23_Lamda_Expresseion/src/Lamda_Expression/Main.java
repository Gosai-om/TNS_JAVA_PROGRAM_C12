package Lamda_Expression;

// with one argument
interface Calculate{
	int getNumber(int no);
}

//with two argument
interface Bank{
	void person(String name,int balance);
}
public class Main {

	public static void main(String[] args) {
		
		Greeting g1 = () -> {System.out.println("Good Morning");};
		g1.Greet();
		
		//with one argument
		Calculate c1 = (int no) -> no*no;
		System.out.println("The Square Is : "+c1.getNumber(10));
		
		//with two argument
		Bank b1 = (String nm,int bal) -> {
			System.out.println("Hello " + nm);
			bal+=5000;
			System.out.println("Your Balance Is : "+bal);
		};
		b1.person("Om", 5000);
	}
}

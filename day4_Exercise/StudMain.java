package day4_Exercise;

public class StudMain {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println("Studnet Without Passing name : "+s1);
		
		Student s2 = new Student("Keval");
		System.out.println("Student With Pass Name: "+s2);

	}

}

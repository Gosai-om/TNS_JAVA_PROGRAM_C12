package Hierarchical;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("Keval");
		e.setAge(22);
		e.setAdd("Ahmedabad");
		e.setPhn("9664617806");
		e.setSal(55000);
		e.setSpec("Java");
		e.setDept("Devlopment");
		
		Manager m = new Manager();
		m.setName("Harsh");
		m.setAge(23);
		m.setAdd("Rajkot");
		m.setPhn("9874565214");
		m.setSal(45000);
		m.setSpec("Android UI/UX");
		m.setDept("Design");
		
		System.out.println("Employee : ");
		e.printSalary();
		System.out.println(e);
		
		System.out.println("Manager : ");
		m.printSalary();
		System.out.println(m);
		
	}

}

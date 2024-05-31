package interface_demo;

public class Interface implements printable,name{

	@Override
	public void printname() {
		// TODO Auto-generated method stub
		System.out.println("My Name Is : "+name);
	}
	
	@Override
	public void printData() {
		// TODO Auto-generated method stub
		System.out.println("Age Is : "+age);
	}

}

package day4_Person_Country;

import day4_country.Country;
import day4_country.State;

public class Person {
	private String pname;
	private Country c1;
	private State s1;
	
	public Person()
	{
		this.pname="";
	}
	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", c1=" + c1 + ", s1=" + s1 + "]";
	}

	public Person(String pname, Country c1, State s1) {
		super();
		this.pname = pname;
		this.c1=c1;
		this.s1=s1;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Country getC1() {
		return c1;
	}

	public void setC1(Country c1) {
		this.c1 = c1;
	}

	public State getS1() {
		return s1;
	}

	public void setS1(State s1) {
		this.s1 = s1;
	}

		
}

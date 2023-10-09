package com.tnsif.staticprograms;
//To demonstrate static variables
public class Employee {
//instance variables
	private String name;
	private int id;
	
	//declare static variable
	static String companyName="TNS";
	   public Employee() {
		super();
	}

	//declare parameterized constructor

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ",id "+id+",company="+companyName+"]";
	}

	
	
	
}

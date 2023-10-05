package com.tnsif.singltinherit;

public class Student extends Citizen{
	private int rollno;
    private String collegename;
   //default constructor 
	public Student() {
		super();
	}
	
	 
	public Student(String name, long aadharno, String address, long phno) {
		super(name, aadharno, address, phno);//accessing from the parent class constructor
		// TODO Auto-generated constructor stub
		this.rollno = rollno;
		this.collegename= collegename;
	}
	public Student(int rollno, String collegename) {
		super();
			this.rollno = rollno;
			this.collegename = collegename;
		}


	//getters and setters
	public int getRollno() {
		return rollno;
	}

}

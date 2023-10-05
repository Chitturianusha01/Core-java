package com.tnsif.markerinterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s =new Student(1,"anu");
if(s instanceof Registerable)
{
	System.out.println("Student Registered");
}
else
    {
		System.out.println("Student Not Registered");
	}

}
}

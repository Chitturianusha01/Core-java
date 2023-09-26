package com.tnsif.inheritance;

 class Parent { //base class 
	 int var=100;
 }
 public class Superdemo extends Parent {
 
	int var=50;
	void display() {
		System.out.println("the child value is "+var);
		System.out.println("the child value is" +super.var);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superdemo ob= new Superdemo();
		ob.display();

	}

}

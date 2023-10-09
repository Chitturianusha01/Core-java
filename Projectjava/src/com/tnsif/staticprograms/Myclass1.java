package com.tnsif.staticprograms;
//program to demonstrate static method and block
public class Myclass1 {

	private int section;//instance variable
	private static int srNo;//static variable
	
	//static block
	static {
		System.out.println("----staticblock------");
		srNo=1000;
	}
	//default constructor
	Myclass1(){
		System.out.println("-----default constructor------");
	srNo++;
	section++;
	}
	void hello() {
		srNo++;
	}
	//static method
		static void display() {
		System.out.println("serialNo"+srNo);
		}
		
	@Override
	public String toString() {
		return "Myclass1 [section=" + section + "]";
	}
	
}

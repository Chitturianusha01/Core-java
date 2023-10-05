package com.tnsif.constructor;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("Enter customer id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
	    name=sc.nextLine();
		System.out.println("Enter city");
	    city=sc.nextLine();
		Customer c1=new Customer();
		c1.setCustomerId(id);
		c1.setCustomerCity(city);
		c1.setCustomerName(name);
		System.out.println(c1);
		
	}

}

package com.tnsif.staticprograms;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee ob=new Employee("Anu",1234);
          System.out.println(ob);
          Employee companyName;//accessing the static variable using classname
          ob=new Employee("puju",456);
          System.out.println(ob);
	}

}

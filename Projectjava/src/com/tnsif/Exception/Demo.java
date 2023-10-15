package com.tnsif.Exception;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner in = new Scanner(System.in);
          int rollno=in.nextInt();
          if(rollno<0)
          {
        	  throw new ArithmeticException("roll no cannot be zero");
          }
	}

}

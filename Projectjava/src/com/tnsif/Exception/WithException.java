package com.tnsif.Exception;

import java.util.InputMismatchException;

public class WithException {
     public static void divide()
     {
    	 int a=6,b=0,c;
    
     try
     {
    	 c=a/b;
     }
     catch(ArithmeticException e)
     {
    	System.out.println("Execption Caught" +e.getMessage()); 
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
    	 System.out.println("Execption Caught" +e.getMessage()); 
     }
     catch(InputMismatchException e)
     {
    	 System.out.println("Execption Caught" +e.getMessage()); 
     }
     finally
     {
    	 System.out.println("This will be executed");
     }
     }
}

package com.tnsif.Exception;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  UserDefined.validate();
      }
      catch(Age e) {
      System.out.println("Caught exception" +e.getMessage());
      
	}
	}

}

package com.tnsif.lambda;

public class Withparameters {

	public static void main(String[] args) {
		
	Cube c=(a)->{return a*a*a;};
	System.out.println(c.calculate(6));
	}

}

package com.tnsif.lambda;

public class Withoutparameters {

	public static void main(String[] args) {
		Message m=()->{return "Hello";};
		System.out.println(m.greet());
	}

}

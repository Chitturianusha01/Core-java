package com.tnsif.abstraction;

public abstract class Shape {
	protected float area;
	//abstract method
		abstract void calArea();
		
		void Show() {
		System.out.println("area of shape:" +area);

}
}
package com.tnsif.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s= new Square();
		Rectangle r=new Rectangle();
		System.out.println(s);
		System.out.println(r);
		Shape sh;
		sh=new Square(4.0f);
		sh.calArea();
		sh.Show();

		sh=new Rectangle(4.0f,5.5f);
		sh.calArea();
		sh.Show();
	}

}

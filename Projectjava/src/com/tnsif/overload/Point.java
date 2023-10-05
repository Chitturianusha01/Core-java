package com.tnsif.overload;

public class Point {
	private float x;
	private float y;
	public Point() {
		x=2.6f;
		y=5.6f;
	}
	public Point(float x) {
		this.x=x;
	}
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

}

package com.tnsif.proghw;

public class Overload {
	public int volume(int s)
	{
		return s*s*s;
	}
    public int volume(int l,int b,int h)
    {
    	return l*b*h;
    }
    public double volume(double r)
    {
    	return (4/3)*3.14*r*r;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload in= new Overload();
        System.out.println(in.volume(2));
	}

}

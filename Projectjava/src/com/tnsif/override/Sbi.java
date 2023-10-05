package com.tnsif.override;

public class Sbi extends Rbi {
	public float getRateofInterst () {
		System.out.println(super.getRateofInterst ());//super class method
		
		return 5.5f;
}

}

package com.tnsif.abstractmethod;

public class NonPrime implements Accounts {
       int amt;
 
	public NonPrime() {
		super();
	}

	public NonPrime(int amt) {
		super();
		this.amt = amt;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public void deliveryCharges(int amt) {
		// TODO Auto-generated method stub
		System.out.println("the amt is:" +amt);
	}

}

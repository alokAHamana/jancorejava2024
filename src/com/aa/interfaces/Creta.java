package com.aa.interfaces;

public class Creta implements Vehical {

	@Override
	public void tyre() {
		System.out.println("4 tyre");
	}

	@Override
	public void cc() {

		System.out.println("1400 cc");
	}
	
	
	public Creta get1() {
		return new Creta();
	}
}

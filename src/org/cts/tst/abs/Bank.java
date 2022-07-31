package org.cts.tst.abs;

public abstract class Bank {

	      //non abstract methods
	
	public void fixed() {
		System.out.println("Fixed deposit  :  4% ");
	}
	
	//abstract methods
	
	public abstract void savings();
	public abstract void loan();
	
}

package org.cts.tst.abs;

public class Axis1 implements Bank1 {

	   public void fixed()
	    {
	    	System.out.println("Fixed rate is 18%");
	    }
	   
	public void savings()
	   {
		   System.out.println("Savings rate is 9 %");
	   }
	
	public static void main(String[] args) {
		
		Axis1 a = new Axis1();
		a.fixed();
		a.savings();

	}
}

package org.cts.tst.abs;

public class PrivateClass2 extends PrivateClass {

	  public void test()
	    {
	    	System.out.println("Test class in child class");
	    	
	    }
	           
	    
	   public static void main(String[] args) {
		   
		          PrivateClass2 p = new PrivateClass2();
		          PrivateClass p1 = new PrivateClass();
		          
		          p.test();
		          p1.test();  
		          
		          
		          
		          
		         // In this program Don't make changes in method name and 
		          //object creation but Print both "automation" and "Selenium".

		
	}
}





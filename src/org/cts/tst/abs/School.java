package org.cts.tst.abs;

public abstract class School {
	
	public School()
	{
		System.out.println("nall");
	}
	  
	 public School(int i)
	 {
		 System.out.println("int parameter constructor");
	 }
	 
	 public School(String s)
	 {
		 System.out.println("new string"+s);
	 }

	    public void schoolDetails(String name)
	    {
	    	System.out.println("Name of the school  -- "+name);
	    }
	    
	    public void vehicleDetails(int n)
	    {
	    	System.out.println("Number of vehicles present in scholl  ==  "+n);
	    }
	    
	    public abstract void feesDetails();
	    public abstract void libraryDetail();   
	    
	    public static void main(String[] args) {
			
		}
	           	    
}

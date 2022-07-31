package org.cts.tst.abs;

public class Virtusa {

	public static void main(String[] args) {
	   
		int a[]= {6,4,2};
		System.out.println("before ordering");
		
		for(int i=0;i<a.length;i++)
			
			System.out.print(a[i]+"    ");
				
		for(int i=0;i<a.length;i++)
		{
			  for(int j=i+1;j<a.length;j++)
			  {
				      if(a[i]>a[j])
				      {
				    	  int temp = a[i];
				    	  a[i] = a[j];
				    	  a[j]=temp;
				      }
			  }
		}
		
		System.out.println("\n\nAfter ordering\n");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"    ");
		
	}
}

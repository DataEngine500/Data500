package org.cts.tst.abs;

import java.util.Scanner;

public class SchoolMgmt extends School{

	   public SchoolMgmt(String string) {
		System.out.println("school mgmt string");
	}

	public SchoolMgmt() {
		System.out.println("Empty school mgmt");
	}

	public SchoolMgmt(int i) {
	 System.out.println("integer  "+i);
	}

	public void feesDetails()
	   {
		   System.out.println("Fees are get based on the , government notification");
	   }
	
	public void libraryDetail() {
		
	 System.out.println("We have 3 common libarraies for all students");		
	}
	
	 public static void main(String[] args) {
		SchoolMgmt s = new SchoolMgmt();
		SchoolMgmt s1 = new SchoolMgmt(504);
		SchoolMgmt s3 = new SchoolMgmt("king of the");
		
		
		
		
		
//		s.feesDetails();
//		s.libraryDetail();
//		Scanner a = new Scanner(System.in);
//		System.out.println("Enter the school name");
//		String name = a.nextLine();
//		s.schoolDetails(name);
//		System.out.println("Enter vehicle details in number");
//		int m = a.nextInt();
//		s.vehicleDetails(m);
	}
}


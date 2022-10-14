package com.Basicblz;

import java.util.Scanner;

public class EmployeeDetailsBlz {

	public static void main(String[] args) {
		
		String fname;
		String Lname;
	
		String Gender = null;
		long mobileNum;
		double sal;
		String emailid;
		String Address;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter The First Name Of Employee");
		
		fname=s.next();
		
        System.out.println("Enter The Last Name Of Employee");
		
	     Lname=s.next();
	    
          System.out.println("Enter The Gender Of Employee");
		
		  fname=s.next();
		  
		  System.out.println("Enter the mobile no Of Employee");
			
		  mobileNum=s.nextLong();
		  
		  System.out.println("Enter the salary Of Employee");
			
		  sal=s.nextDouble();
		  
		  System.out.println("Enter the email id  Employee");
			
		  emailid=s.next();
		  
		  System.out.println("Enter the Address of  Employee");
			
		  Address=s.next();
		  
		  
		  System.err.println(fname+" "+Lname+" "+Gender+" "+mobileNum+" "+sal+" "+emailid+" "+Address);
		  
		  
		  
		  
			
		
	    	
	    	
		
		
		
		
		

	}

}

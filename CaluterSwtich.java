package Com.Basic;

import java.util.Scanner;

public class CaluterSwtich {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter The number 1");

		int  num1 = s.nextInt();

		

		System.out.println("Enter The number 2");

		int num2  = s.nextInt();

		

		System.out.println("Enter ur Option");

		int option = s.nextInt();
		
		System.out.println("press\n 1 Addition\n 2 substrction \n 3 Multification \n 4 Division");
		
		
		switch(option){
		
		
		case 1:
			
			     System.out.println("Addtion is : "+num1+num2);
			     
			     break;
			     

		case 2:
			
			     System.out.println("Substraction  is : "+(num1-num2));
			     
			     break;
			     
			     

		case 3:
			
			     System.out.println("Multification is : " +num1*num2);
			     
			     break;
			     
			     

		case 4:
			
			     System.out.println("Division  is : " +num1/num2);
			     
			     break;
			     
			     

		case 5:
			
			     System.out.println("Addtion is : " +num1%num2);
			     
			     break;
			     
			     
	  default :
		  
		       System.err.println("Out of Option");
			
			
			
			
			
			
			
		}
		
	
		

	}

	
		
	}


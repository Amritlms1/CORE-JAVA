package operation;

import java.util.Scanner;

public class alloperation {
	 public static void main(String []args)
	    {
		 Scanner sc=new Scanner(System.in);
		 double x,y;
	        System.out.println("Enter any 2 number");
	        x=sc.nextDouble();
	        y=sc.nextDouble();
	        System.out.println("The sum is    "+(x+y));
	        System.out.println("Substraction is     "+(x-y));
	        System.out.println("Multiplication  is    "+(x*y));
	        System.out.println("Division  is"+(x/y));
	        System.out.println("Reminder is"+(x%y));
	        
	    }
}

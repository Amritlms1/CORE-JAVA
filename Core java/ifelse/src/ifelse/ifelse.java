package ifelse;

import java.util.Scanner;

public class ifelse {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.println("Enter your score");
	x=sc.nextInt();
	if(x>=90)
	{
		System.out.println("Your score is excellent and with grad  A");
	}
	else if(x>=70 && x<90)
	{
		System.out.println("Your score is good and with grad  B");
	}
	else if(x>=30 && x<70)
	{
		System.out.println("Your score is above passing and with grad  C");
	}
	else
	{
		System.out.println("You failed the exam with grad  F");
	}
	
}
}

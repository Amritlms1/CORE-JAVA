package nestedif;

import java.util.Scanner;

public class nestedif {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.println("Enter a number between 100");
	x=sc.nextInt();
	if(x<=100)
	{
		System.out.println("Number is lesser than 90");
		if(x<70)
		{
			System.out.println("Number is lesser than 70");
			if(x<40)
			{
				System.out.println("Number is lesser than 40");
			}
		}
	}
		
}
}

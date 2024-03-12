package prime;

import java.util.Scanner;

public class prime {
	public static void main(String ar[])
	{
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		x=sc.nextInt();
		z=0;
		for(y=1;y<=x;y++)
		{
			if(x%y==0)
			{
				z++;
			}
		}
		if(z==2)
		{
			System.out.println("It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
	}
}

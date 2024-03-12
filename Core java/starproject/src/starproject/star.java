package starproject;

import java.util.Scanner;

public class star {
	public static void main(String ar[])
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines");
		x=sc.nextInt();
		System.out.println("number of lines"+x);
		int i;
		for(i=1;i<=x;i++)
		{
			if(i%2==1)
			{
				for(int j=1;j<=1+(2*x);j++)
				{
					if(j%2==0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print("    ");
					}
				}
				System.out.print(" \n");
			}
			
		
		if(i%2==0)
		{
			for(int j=1;j<=1+(2*x);j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("    ");
				}
			}
			System.out.print(" \n");
		}
		
	}
	}
}

package While;

import java.util.Scanner;

public class starprojecyt {
public static void main(String [] args)
{
	int i,j,k,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	n=sc.nextInt();
	for(j=0;j<=n;j++)
	{
		for(k=0;k<=n-j;k++)
		{
			System.out.print(" ");
		}
		for(i=0;i<=j;i++) 
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}
}

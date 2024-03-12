package dowhoile;

import java.util.Scanner;

public class dowhile {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the interval in while you want to display Natural number");
	int i,x;
	i=sc.nextInt();
	x=sc.nextInt();
	System.out.println("The number between "+i+" to "+x+" is");
	do
	{
		System.out.println(i);
		i++;
	}while(i<x);
}
}

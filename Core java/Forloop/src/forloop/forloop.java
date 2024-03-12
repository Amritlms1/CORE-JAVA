package forloop;

import java.util.Scanner;

public class forloop {
public static void main(String ar[])
{
	int i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the interval in between you wanna show the Natural numbers:");
	i=sc.nextInt();
	j=sc.nextInt();
	System.out.print("The numbers are=");
	for(int m=i; m<j;m++)
	{
		System.out.print(" "+m);
	}
}
}

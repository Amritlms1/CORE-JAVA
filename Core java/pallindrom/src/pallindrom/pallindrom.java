package pallindrom;

import java.util.Scanner;

public class pallindrom {
public static void main(String ar[])
{
	int x,y,z,a;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number");
	x=sc.nextInt();
	a=x;
	z=0;
	while(x>0)
	{
		y=x%10;
		x=x/10;
		z=(z*10)+y;
	}
	if(z==a)
	{
		System.out.println("It is a Pallindrom number");
	}
	else
	{
		System.out.println("It is not a Pallindrom number");	
	}
}
}

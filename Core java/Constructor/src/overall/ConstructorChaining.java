package overall;

import java.util.Scanner;

public class ConstructorChaining {
	int a,b,c;
	public static void main(String[]ar)
	{
		ConstructorChaining c=ConstructorChaining.getdata();
		c.sum();
		
	}
	ConstructorChaining(int a)
	{
		this.a=a;
	}
	ConstructorChaining(int a,int b)
	{
		this(a);
		this.b=b;
	}
	ConstructorChaining(int a,int b,int c)
	{
		this(a,b);
		this.c=c;
	}
	public void sum()
	{
		System.out.println("Sum is= "+(a+b+c));
	}
	public static ConstructorChaining getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		return new ConstructorChaining(a,b,c);
		
	}
}

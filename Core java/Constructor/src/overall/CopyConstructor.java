package overall;

import java.util.Scanner;

public class CopyConstructor {
int i;
int j;
CopyConstructor(int i,int j)
{
	this.i=i;
	this.j=j;
}
CopyConstructor(CopyConstructor c)
{
	this.i=c.i;
	this.j=c.j;
}
public static CopyConstructor getdata()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 number");
	int i=sc.nextInt();
	int j=sc.nextInt();
	return new CopyConstructor(i,j);
	
}
public static void main(String ar[])
{
	CopyConstructor c1=CopyConstructor.getdata();
	CopyConstructor c2=new CopyConstructor(c1);
	System.out.println("Sum of 2 number="+(c2.i+c2.j));
	
}
}

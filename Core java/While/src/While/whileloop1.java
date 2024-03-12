package While;

import java.util.Scanner;

public class whileloop1 {
public static void main(String ar[])
{
	int x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the interval to print all natural number between");
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("The numbers are");
	while(x<y)
	{
		System.out.println(x);
		x++;
	}
	
}
}

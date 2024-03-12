package ternaryoperator;

import java.util.Scanner;

public class ternary {
public static void main(String ar[])
{
	int x,y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 number to check greater number");
	x=sc.nextInt();
	y=sc.nextInt();
	int greater=x>y?x:y;
	System.out.println("The greater number between given number is  "+greater);
}
}

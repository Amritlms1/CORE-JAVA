package forloop;

import java.util.Scanner;

public class forloop1 {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		int x ;
		System.out.println("Enter the number will save in array");
		x=sc.nextInt();
		int [] arr=new int[x];
		System.out.println("Enter all "+ x+" Numbers for array");
		for(int i=0; i<x;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Entered number=");
		for(int j:arr)
		{
			System.out.println(j);
		}
	}
}

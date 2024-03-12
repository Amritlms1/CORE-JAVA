package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist2 {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int x;
	System.out.println("Enter the size of ArrayList");
	x=sc.nextInt();
	List<Integer> arrayList=new ArrayList<Integer>(x);
	for(int i=0;i<x;i++)
	{
		arrayList.add(i);
	}
	System.out.println(arrayList);
	System.out.println("The values in the list is:=");
	for(int i=0;i<arrayList.size();i++)
	{
		System.out.print(arrayList.get(i)+" ");
	}
	System.out.print("\n");
	//Enhance for loop
		System.out.println("After Enhance for Loop same values are");
		for(int i:arrayList)
		{
	System.out.print(i+" ");
		}
		System.out.print("\n");
	System.out.println("Enter the number you want to remove");
	int y;
	y=sc.nextInt();
	if(y<x)
	{
	arrayList.remove(y);
	System.out.print(arrayList+" ");
	}
	else
	{
		System.out.println("The number does not exist in the arrayList");
	}
}
}

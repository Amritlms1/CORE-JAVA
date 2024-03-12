package Arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arraylist1 {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int x,y;
	System.out.println("Enter the size of arrayList=");
	x=sc.nextInt();
	List<Integer> arrayList=new ArrayList<Integer>(x);
	for(int i=0;i<x;i++)
	{
		arrayList.add(i);
	}
	System.out.println(arrayList);
	System.out.println("Which index you want to remove from ArrayList");
	y=sc.nextInt();
	arrayList.remove(y);
	System.out.println(arrayList);
	for (int i=0;i<arrayList.size();i++)
	{
		System.out.println(arrayList.get(i)+"  ");
	}
}
}

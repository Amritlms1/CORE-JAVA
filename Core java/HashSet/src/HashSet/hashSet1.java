package HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class hashSet1 {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	HashSet<Integer> hashSet=new HashSet<Integer>();
	for(int i=0;i<3;i++)
	{
		if(i==1)
		{
			continue;
		}
		hashSet.add(i);
		
	}
	System.out.println("hashset is"+hashSet);
	System.out.println("hashset datas are");
	for(int j:hashSet)
	{
		System.out.print(j+"  ");
	}
}
}

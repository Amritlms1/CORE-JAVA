package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class arraylist {
public static void main(String ar[])
{
	List<Integer> arrayList=new ArrayList<Integer>(5);
	for(int i=0;i<5;i++)
	{
		arrayList.add(i);
	}
	System.out.println(arrayList);
	arrayList.remove(3);
	System.out.println(arrayList);
}
}

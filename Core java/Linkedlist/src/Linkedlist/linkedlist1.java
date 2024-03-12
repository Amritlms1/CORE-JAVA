package Linkedlist;

import java.util.LinkedList;

public class linkedlist1 {
public static void main(String ar[])
{
	LinkedList<String> linkedList=new LinkedList<String>();
	linkedList.add("C");
	linkedList.add("A");
	linkedList.addFirst("B");
	linkedList.add("f");
	System.out.println(linkedList);
	linkedList.remove(1);
	System.out.println(linkedList);
	linkedList.addAll(linkedList);
	System.out.println(linkedList);
}
}

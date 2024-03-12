package Linkedlist;

import java.util.LinkedList;

public class linkedlist {
public static void main(String ar[])
{
	LinkedList<String> linkedList=new LinkedList<String>();
	linkedList.add("A");
	linkedList.add("B");
	linkedList.addFirst("C");
	linkedList.addLast("D");
	linkedList.add(2,"E");
	System.out.println("The linkedList is"+linkedList);
	linkedList.remove("A");
	System.out.println("The linkedList is"+linkedList);
	linkedList.remove(3);
	System.out.println("The linkedList is"+linkedList);
	linkedList.removeFirst();
	System.out.println("The linkedList is"+linkedList);
}
}
package treeSet;

import java.util.TreeSet;

public class treeSet {
public static void main(String ar[])
{
	TreeSet<String> treeset=new TreeSet<String>();
	treeset.add("B");
	treeset.add("A");
	treeset.add("C");
	treeset.add("B");
	System.out.println("The tree set is  "+treeset);
	System.out.println(treeset.size());
	System.out.println(treeset.remove("B"));
	System.out.println("The tree set is  "+treeset);
}
}

package HashSet;

import java.util.HashSet;
import java.util.Set;

public class hashset {
public static void main(String ar[])
{
	Set<String> hashSet=new HashSet<String>();
	hashSet.add("B");
	hashSet.add("A");
	hashSet.add("A");
	System.out.println(hashSet);
	hashSet.addAll(hashSet);
	System.out.println(hashSet);
	System.out.println("HashSet Contains A    "+hashSet.contains("A"));
	System.out.println("HashSet Contains   C "+hashSet.contains("C"));
	hashSet.remove("A");
	System.out.println("After removing a the hashset is  "+hashSet);
}
}

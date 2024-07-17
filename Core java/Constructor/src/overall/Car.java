package overall;

import java.util.Scanner;

public class Car {
	String name;
	String color;
	int number;
Car(String name,String color,int number)
{
	this.name=name;
	this.color=color;
	this.number=number;
}
public static Car getCarDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of car");
	String name=sc.next();
	System.out.println("Enter the color of car");
	String color=sc.next();
	System.out.println("Enter the number of car");
	int number=sc.nextInt();
	return new Car(name,color,number);
	
}
public void display()
{
	System.out.println("The name of car   "+name);
	System.out.println("The color of car  "+color);
	System.out.println("The number of car   "+number);
}
}

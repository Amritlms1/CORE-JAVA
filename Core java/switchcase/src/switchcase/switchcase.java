package switchcase;

import java.util.Scanner;

public class switchcase {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int month;
	String monthname; 
	System.out.println("Enter the number of month");
	month=sc.nextInt();
	switch(month)
	{
	case 1:
		monthname="January";
		break;
	case 2:
		monthname="Feb";
		break;
	case 3:
		monthname="March";
		break;
	case 4:
		monthname="April";
		break;
	case 5:
		monthname="May";
		break;
	case 6:
		monthname="June";
		break;
	case 7:
		monthname="July";
		break;
	case 8:
		monthname="August";
		break;
	case 9:
		monthname="Sept";
		break;
	case 10:
		monthname="October";
		break;
	case 11:
		monthname="November";
		break;
	case 12:
		monthname="December";
		break;
		default:
			monthname="Invalid Month";
			break;
	
	}
	System.out.println("As per you enter monthnumber the Month Name is  "+monthname);
}
}

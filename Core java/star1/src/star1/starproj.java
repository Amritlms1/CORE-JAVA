package star1;

import java.util.Scanner;

public class starproj {
public static void main(String ar[])
{
	int x;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no of lines");
	x=sc.nextInt();
	int i,j;
	for(i=1;i<=x;i++)
	{
		//if(i==1)
		//{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
		//}
			int n=i;
		
			for(int k=1;k<=x-i+1;k++)
			{
				System.out.print(n);
				n++;
			}

	System.out.println();

}
}
}
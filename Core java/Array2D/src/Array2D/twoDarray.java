package Array2D;

import java.util.Scanner;

public class twoDarray {
public static void main(String ar[])
{
 int[][] arr_2d = new int[3][3];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 8 number for 2D array");
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
		arr_2d[i][j]=sc.nextInt();
	 }
	 
 }
 System.out.println("The 2D arrays is");
 for(int i=0;i<3;i++)
 {
	 for(int j=0;j<3;j++)
	 {
	System.out.print(arr_2d[i][j]);	
	System.out.print("  ");
	 }
		System.out.println("\n");
}
}
}
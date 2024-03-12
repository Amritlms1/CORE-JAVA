package Array3D;

import java.util.Scanner;

public class array3d {
public static void main(String ar[])
{
	Scanner sc=new Scanner(System.in);
	int[][][] arr=new int[3][3][3];
	System.out.println("Enter the numbers of 3d array 27 numbers");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
				arr[i][j][k]=sc.nextInt();
			}
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			for(int k=0;k<3;k++)
			{
			System.out.print(" "+arr[i][j][k]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
}

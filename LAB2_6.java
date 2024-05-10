/*6. Aim of the program: Find sum of each diagonal (left &amp; right) elements separately of a user entered 3 X 3 matrix in Java.
Input: Enter 3X3 matrix
e.g. 6 7 3
     8 9 2
     1 2 9
Output: Left=24
        Right=13 */

import java.util.*;
public class LAB2_6
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int[][] arr=new int[3][3];

		System.out.println("Enter 3X3 matrix");
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				arr[i][j]=in.nextInt();
			}
			System.out.println("");
		}

		//sum of left diagonal
		int left=0;
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(i==j)
				   left = left+arr[i][j];
			}
	    }
	    System.out.println("Left="+left);
	    int right = arr[0][2]+arr[1][1]+arr[2][0];
	    System.out.println("Right="+right);
	}
}

/*
00 01 02
10 11 12
20 21 22  */
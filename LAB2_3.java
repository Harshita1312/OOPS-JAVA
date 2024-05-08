/*3.Aim of the program: Program to sort the user entered list of numbers of any size
Input: List of Numbers
Output: Display the numbers in Ascending order*/

import java.util.*;
public class LAB2_3
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n; //n=size of array

		System.out.print("Enter size of array: ");
		n=in.nextInt();

		//CREATION OF ARRAY
		int[] arr;
		arr= new int[n];
		System.out.print("Enter array elements: ");
		for (int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		//SORT THE ARRAY
		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		//PRINT THE ARRAY
		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
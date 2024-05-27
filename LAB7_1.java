/*. Aim of the program - Write a Java program to generate an ArrayIndexOutofBoundsException and handle it using catch statement.
Input: Enter the numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread “main”
java.lang.ArrayIndexOutOfBoundsException:4 */

import java.util.*;

class LAB7_1
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter size of array:");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the numbers: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		try
		{
			System.out.print("array elements: ");
			for(int i=0;i<=size;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception in thread main");
			System.out.println(e);
		}
	}
}
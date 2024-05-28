/*2. Aim of the program- Write a Java program to handle an ArithmeticException
using try, catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block */

import java.util.*;

class LAB7_2
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int a,b,c;
		System.out.print("enter value of dividend: ");
		a=in.nextInt();
		System.out.print("enter value of divisor: ");
		b=in.nextInt();
		try
		{
			c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("You cannot divide a number by zero");
		}
		finally
		{
			System.out.println("in finally block");
		}
	}
}
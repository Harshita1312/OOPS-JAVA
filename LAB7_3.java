/* 3. Aim of the program- Write a Java class which has a method called ProcessInput().
This method checks the number entered by the user. If the entered number is negative then throw an user defined exception called
NegativeNumberException, otherwise it displays the double value of the entered number.
Input: Enter a number 4
Output: Double value: 8
Input: Enter a number -4
Output: Caught the exception
Exception occurred: NegativeNumberException: number should be positive*/

import java.util.Scanner;

class NegativeNumberException extends RuntimeException  //unchecked user defined exception
{
	NegativeNumberException(String msg)
	{
		super(msg); //goes to the default exception handler
	}
}
class check
{
	public void ProcessInput(int num)
	{
		try
		{
			if(num<0)
			{
				throw new NegativeNumberException("number should be positive");
				// donot provide any statement after throw statement
			}
			else
			{
				System.out.println("Double value: "+(num*2));
			}
		}
		catch(NegativeNumberException e)
		{
			System.out.println("Caught the exception");
			System.out.println(e);
		}
	}
}
class LAB7_3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int num=in.nextInt();

		check obj=new check();
		obj.ProcessInput(num);
	}
}


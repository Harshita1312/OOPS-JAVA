/*4. Aim of the program : Write a program to overload subtract method with various parameters in a class in Java.
Write the driver class to use the different subtract methods using object.
Input: Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly */

import java.util.*;

class overload
{
	public int subtract(int a, int b) // subtraction of two integer values
	{
		return (a-b);
	}
	public int subtract(int a, int b, int c) // subtraction of three integer values
	{
		return (a-b-c);
	}
	public double subtract(double a, double b) // subtraction of two double values
	{
		return (a-b);
	}

}

public class LAB3_4
{
	public static void main(String args[])
	{
		overload obj = new overload();
		System.out.println("Different subtract method:");
		int int_result = obj.subtract(10,7);
		System.out.println("Subtraction of integers values: " + int_result);
		int_result = obj.subtract(10,7,2);
		System.out.println("Subtraction of three integers values: " + int_result);
		double double_result = obj.subtract(10.99,7.32);
		System.out.println("Subtraction of integers values: " + double_result);

	}
}
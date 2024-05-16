/*6. Aim of the program : Write a program in java using constructor overloading concept to
calculate the area of a rectangle having data member as length and breadth. Use default
constructor to initialize the value of the data member to zero and parameterized
constructor to initialize the value of data member according to the user input.
Input: Mention the value of length and breadth
Output: Display the area of rectangle accordingly. */

import java.util.*;

class rectangle
{
	int length, breadth;
	public rectangle() // default constructor
	{
		length = 0;
		breadth = 0;
	}
	public rectangle(int l, int b) // parameterized constructor
	{
		length = l;
		breadth = b;
	}
	public int area()
	{
		return ( length * breadth );
	}
}

public class LAB3_6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		rectangle obj1 = new rectangle();
		int l,b;
		System.out.print("Enter length of rectangle: ");
		l = in.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		b = in.nextInt();
		rectangle obj2 = new rectangle(l,b);

		int def_result = obj1.area();
		int para_result = obj2.area();

		System.out.println("Area of rect (default): "+def_result);
		System.out.println("Area of rect (parameterizedd): "+para_result);

	}
}
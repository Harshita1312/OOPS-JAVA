/*2. Aim of the program : Write a program in Java to create a class Rectangle having data members length and breadth and
three methods called read, calculate and display to read the values of length and breadth,
calculate the area and perimeter of the rectangle and display the result respectively
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle.
Input: Mention length and breadth
Output: Display Area of Rectangle and Perimeter of rectangle. */

import java.util.*;

class Rectangle
{
	private int length, breadth;
	private int area, perimeter;
	Scanner in = new Scanner(System.in);

	public Rectangle(int length, int breadth) // constructor [ same name as class name, creates object, no return type ]
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void read()  // method
	{
		System.out.print("Enter length: ");
		length = in.nextInt();
		System.out.print("Enter breadth: ");
		breadth = in.nextInt();
	}
	public void calculate()  // method
	{
		area = length * breadth;
		perimeter = 2*(length+breadth);
	}
	public void display()  // method
	{
		System.out.println("Area of rectangle: "+area);
		System.out.println("Perimeter of rectangle: "+perimeter);
	}
}

public class LAB3_2
{
	public static void main(String args[])
	{
		Rectangle obj = new Rectangle(0,0);
		obj.read();
		obj.calculate();
		obj.display();
	}
}
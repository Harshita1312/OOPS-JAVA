/*5. Aim of the program : Write a program which will overload the area () method and display
the area of a circle, triangle and square as per user choice and user entered dimensions.
Input: Mention dimensions like radius, base, height, side
Output: Display area of circle
Display area of triangle
Display area of square */

import java.util.*;

class overload
{
	double calc;

	public double area(float pi, double radius)  // area of circle
	{
		calc = pi * radius * radius;
		return calc;
	}
	public double area(double base, double height)  // area of triangle
	{
		calc = 0.5 * base * height;
		return calc;
	}
	public double area(double side) // area of square
	{
		calc = side * side;
		return  calc;
	}
}

public class LAB3_5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		overload obj =  new overload();
		double r,b,h,s;

		System.out.println("Enter dimension: ");
		System.out.print("Enter radius of circle: ");
		r = in.nextDouble();
		System.out.print("Enter base of triangle: ");
		b = in.nextDouble();
		System.out.print("Enter height of triangle: ");
		h = in.nextDouble();
		System.out.print("Enter side of square: ");
		s = in.nextDouble();

		System.out.println("\nArea of circle: "+obj.area(3.14,r));
		System.out.println("Area of triangle: "+obj.area(b,h));
		System.out.println("Area of square: "+obj.area(s));
	}
}
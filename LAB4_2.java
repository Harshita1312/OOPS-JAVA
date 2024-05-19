/*2. 2.Aim of the program : Illustrate the execution of constructors in multi-level inheritance
with three Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
where box inherits from plate and woodbox inherits from box class. Each class has constructor where dimensions are taken from user.
Input: Enter the dimensions
Output: Display the dimensions accordingly */

import java.util.*;

class plate
{
	public plate(double l, double w)
	{
		System.out.println("PLATE:\n length:"+l+"  width:"+w);
	}

}
class box extends plate
{
	public box(double l, double w, double h)
	{
		    super(l,w);
			System.out.println("BOX:\n length:"+l+"  width:"+w+"  height:"+h);
	}
}
class woodbox extends box
{
	public woodbox(double l, double w, double h, double t)
	{
		super(l,w,h);
			System.out.println("WOODBOX:\n length:"+l+"  width:"+w+"  height:"+h+"  thickness:"+t);
	}
}

public class LAB4_2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double length, width, height, thickness;

		System.out.print("Enter length of box: ");
		length = in.nextDouble();
		System.out.print("Enter width of box: ");
		width = in.nextDouble();
		System.out.print("Enter height of box: ");
		height = in.nextDouble();
		System.out.print("Enter thickness of box: ");
		thickness = in.nextDouble();

		woodbox obj = new woodbox(length, width, height, thickness);
	}
}

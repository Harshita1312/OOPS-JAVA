/*1.1.Aim of the program : A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box.
The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft.
Implement it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits from 2D.
Input:	Enter  dimensions
Output: Display the cost of plastic  */


import java.util.*;

class twoD
{
	int cost_sheet = 40;
	public twoD(double l, double w)
	{
		double sheet_plastic= l * w * cost_sheet;
		System.out.println("cost of plastic(sheet): "+sheet_plastic);
	}

}
class threeD extends twoD
{
	int cost_box = 60;
	public threeD(double l, double w, double h)
	{
		super(l,w);
		double box_plastic= l * w * h * cost_box;
		System.out.println("cost of plastic(box): "+box_plastic);
	}
}

public class LAB4_1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double length, width, height;

		System.out.print("Enter length of sheet (ft): ");
		length = in.nextDouble();
		System.out.print("Enter width of sheet (ft): ");
		width = in.nextDouble();
		System.out.print("Enter height of sheet (ft): ");
		height = in.nextDouble();

		threeD obj = new threeD(length, width, height);
	}
}



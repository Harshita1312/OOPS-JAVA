/*1. Aim of the program :Write a class file – box with three data members(length, width, height) and a method volume() .
Also implement the application class Demo where an object of the box class is created with user entered dimensions and volume is printed.

Input: length,width and height.
Output: Volume */

import java.util.*;

class box
{
	int length;     // data members
	int width;
	int height;

	public int volume()  // method
	{
		int vol = length * width * height ;
		return vol;
	}
}

public class LAB3_1
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
	    box obj = new box();

	    System.out.print("Enter length: ");
	    obj.length=in.nextInt();
	    System.out.print("Enter width: ");
	    obj.width = in.nextInt();
	    System.out.print("Enter height: ");
	    obj.height = in.nextInt();

	    int vol = obj.volume();
	    System.out.println("volume: "+vol);

	}
}

/*
  CLASS USES - encapsulation - hiding information
           - reusability - create multiple objects for class and save space
           - inheritance - inherit properties
  METHOD - has return type
         - method name specifics the purpose of the method
         - parameters
  TYPES OF METHOD
  - INSTANCE - called using object
  - STATIC - is called once if the class is loaded
  - CONSTRUCTOR - create and initialize objects of class
                - has no return type
                - name same as the class name
  METHOD OVERLOADING
  - methods with same method name but with different return types or parameters
  CONSTRUCTOR OVERLOADING
  - same constructor name(same as class) only with different parameters

*/
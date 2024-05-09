/*4.Aim of the program: Program to find no. of objects created out of a class using ‘static’ modifier.
Input: No of objects created
Output: Display the number of objects created (e.g. no of objects=3)*/

import java.util.*;

class A
{
	static int count=0;
	A()
	{
		count++;
	}
	public static void display()
	{
		System.out.println("no.of objects created:"+count);
	}
}

public class ObjectCounter
{
	public static void main(String srgs[])
	{
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();

       obj1.display();
	}
}

/* import java.util.*;

    public class ObjectCounter {

	    // Static variable to count the number of objects
	    private static int count = 0;

	    // Constructor to increment the count when a new object is created
	    public ObjectCounter() {
	        count++;
	    }

	    // Static method to display the current count of objects
	    public static void displayCount() {
	        System.out.println("Number of objects created: " + count);
	    }

	    public static void main(String[] args) {
	        // Create three objects of the class
	        ObjectCounter obj1 = new ObjectCounter();
	        ObjectCounter obj2 = new ObjectCounter();
	        ObjectCounter obj3 = new ObjectCounter();

	        // Display the total number of objects created
	        displayCount(); // Output: Number of objects created: 3
	    }
	}
*/

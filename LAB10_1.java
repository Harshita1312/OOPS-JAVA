/*1. Aim of the program - Write a program in Java using multi-threading which will display a
counter value within a specified range with a gap of 5 milliseconds after setting it’s name
as given by the user.
Input : Name of the thread - First
Lower range of counter - 10
Upper range of counter - 15
Output : Thread - First
Counter - 10 11 12 13 14 15*/

import java.util.*;

class test implements Runnable
{
	int low, upper;
	public void run()
	{
		System.out.println("Thread - "+Thread.currentThread().getName());
		try
		{
			for(int i=low; i<=upper; i++)
			{
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
			System.out.println();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class LAB10_1
{
	public static void main(String args[])
	{
		test obj = new test();
		Thread t1 = new Thread(obj);
		Scanner in = new Scanner(System.in);
		System.out.print("Name of the thread : ");
		String name = in.nextLine();
		t1.setName(name);
		System.out.print("Lower range of counter: ");
		obj.low = in.nextInt();
		System.out.print("Upper range of counter: ");
		obj.upper = in.nextInt();
		t1.start();
	}
}



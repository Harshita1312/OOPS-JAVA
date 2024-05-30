/*4. Aim of the Program: Write a program to create user defined exceptions called HrsException, MinException and SecException.
Create a class Time which contains data members hours, minutes, seconds and a method to take a time
from user which throws the user defined exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).
Input: Enter hours: 4
       Enter minutes: 54
       Enter seconds: 34
Output: Correct Time-> 4:54:34
Input: Enter hours: 30
       Enter minutes: 65
       Enter seconds: 65
Output: Caught the exception
        Exception occurred: InvalidHourException:hour is not greater than 24
        Exception occurred: InvalidMinuteException:hour is not greater than 60
        Exception occurred: InvalidSecondException:hour is not greater than 60 */

import java.util.Scanner;

class HrsException extends RuntimeException  //unchecked user defined exception
{
	HrsException(String msg)
	{
		super(msg); //goes to the default exception handler
	}
}
class MinException extends RuntimeException  //unchecked user defined exception
{
	MinException(String msg)
	{
		super(msg); //goes to the default exception handler
	}
}
class SecException extends RuntimeException  //unchecked user defined exception
{
	SecException(String msg)
	{
		super(msg); //goes to the default exception handler
	}
}

class time
{
	Scanner scanner = new Scanner(System.in);
	int hours,mins,secs;
	String error="";
	void check()
	{
		System.out.print("Enter hours: ");
	    hours = scanner.nextInt();
	    try{
	       if (hours > 24 || hours < 0) {
			   throw new HrsException("hours cannot be greater than 24");
	       }
	    }
	    catch(HrsException e)
	    {
			error+=e+"\n";
		}

	    System.out.print("Enter minutes: ");
	    mins = scanner.nextInt();
	    try{
	    if (mins > 60 || mins < 0) {
			throw new MinException("minutes cannot be greater than 60");
	    }
	    }
	    catch(MinException e)
	    {
			error+=e+"\n";
		}

	    System.out.print("Enter seconds: ");
	    secs = scanner.nextInt();
	    try
	    {
	    if (secs > 60 || secs < 0) {
			throw new SecException("seconds cannot be greater than 60");
	    }
	    }
	    catch(SecException e)
	    {
			error+=e+"\n";
		}
    }
    void displayTime() {
	        System.out.println("Correct Time-> " + hours + ":" + mins + ":" + secs);
    }
    void displayErrors() {
		if (!error.isEmpty())
		{
			System.out.println("Caught the exception");
	        System.out.println(error);
	     }
    }
}
class LAB7_4
{
	public static void main(String args[])
	{
		time t = new time();
		t.check();
		if(t.error.isEmpty())
		{
			t.displayTime();
		}
		else
		{
			t.displayErrors();
		}
	}
}
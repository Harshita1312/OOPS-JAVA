 /*5. Aim of the Program: Create an user defined exception named CheckArgument to check the number of arguments passed through command line.
If the number of arguments is less than four then throw the Check Argument exception, else print
the addition of squares of all the four elements.
Input: 4 3 2 1
Output : 30
Input: 4 3 2
Output : Exception occurred - CheckArgument */

import java.util.*;

class CheckArgument extends RuntimeException
{
	CheckArgument(String msg)
	{
		super(msg);
	}
}
class test
{
	int sum=0,count=0;
	public int add(int a){
		count++;
		sum+=a*a;
		return count;
	}
	void check(int count)
	{
	try
	{
		if(count<4)
		{
			throw new CheckArgument("arguments are less than 4");
		}
		else
		{
			System.out.println("Output:"+sum);
		}
	}
	catch(CheckArgument e)
	{
		System.out.println(e);
	}
}
}

class LAB7_5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		test t=new test();
		int c=0;

		for (String arg : args) {
		            c=t.add(Integer.valueOf(arg)); // Convert String to int
        }
        t.check(c);

	}
}

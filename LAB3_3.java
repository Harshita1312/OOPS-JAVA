/*3. Aim of the program :
Write a program in java to input and display the details of n number of students
having roll, name and cgpa as data members.
Also display the name of the student having lowest cgpa.
Input: Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students.
Also display the name of student with lowest cgpa */

import java.util.*;

class student
{
	String name;
	int roll_no;
	float cgpa;
	Scanner in = new Scanner(System.in);

	public void input()  //method
    {
	   	System.out.print("Enter Roll no of student: ");
	   	roll_no = in.nextInt();
	   	System.out.print("Enter name of student: ");
	   	name = in.next();
	   	System.out.print("Enter cgpa of student: ");
	    cgpa = in.nextFloat();
    }
    public void display(student arr[], int n) // method
    {
		System.out.println("\nDetails of student");
		for ( int i=0; i<n; i++ )
		{
			System.out.print((i+1)+") Name:" + arr[i].name);
			System.out.print("  Roll_no:" + arr[i].roll_no);
			System.out.println("  Cgpa:" + arr[i].cgpa);
		}
	}
	public void check(student arr[], int n)  // method
	{
		System.out.print("\nStudent with lowest cgpa: ");
		double low = arr[0].cgpa;
		int index = 0;
		for ( int i=0; i<n; i++ )
		{
			if(low > arr[i].cgpa)
			{
			    low = arr[i].cgpa;
			    index = i;
			}
		}
		System.out.println(arr[index].name+"\n");
	}
}

public class LAB3_3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter no. of student: ");
		int n = in.nextInt();

		student arr[] = new student[n];   //array for student details

		for (int i=0; i<n; i++)   // imput from user for student details
		{
			student obj = new student();
			obj.input();
			arr[i] = obj;
		}
		student obj = new student();
		obj.display(arr,n);
		obj.check(arr,n);
	}
}

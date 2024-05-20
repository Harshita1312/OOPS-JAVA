/* 4.Aim of the program :Write a class Account containing acc_no, balance as data members and two methods as input()
for taking input from user and disp() method to display the details.
Create a subclass Person which has name and aadhar_no as extra data members and override disp() function.
Write the complete progrm to take and print details of three persons.
Input: Enter details of three persons.
Output: Display details of three persons. */

import java.util.*;

class account
{
	Scanner in=new Scanner(System.in);
	int acc_no, balance;
	void input()
	{
		System.out.print("Enter account number: ");
		acc_no = in.nextInt();
		System.out.print("Enter balance: ");
        balance = in.nextInt();
	}
	void display()
	{
		System.out.println("account no:"+acc_no);
		System.out.println("balance:"+balance);
	}
}
class person extends account
{
	Scanner in=new Scanner(System.in);
	String name;
	int aadhar_no;
	void input()
	{
		super.input();
		System.out.print("Enter name: ");
		name = in.nextLine();
		System.out.print("Enter aadhar number: ");
        aadhar_no = in.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println("name:"+name);
		System.out.println("aadhar no:"+aadhar_no);
	}
}

public class LAB4_4
{
	public static void main(String args[])
	{
		person arr[] = new person[3];

		for(int i=0; i<3; i++)
		{
			System.out.println("enter details of student"+(i+1)+": ");
			arr[i] = new person();
			arr[i].input();
		}
		System.out.println("OUTPUT");
		for(int i=0; i<3; i++)
		{
			System.out.println("Details of student"+(i+1)+": ");
			arr[i].display();
		}

	}
}


/*
import java.util.Scanner;

public class LAB4_4
{
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }
System.out.println("\nDetails of all persons:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Details of person " + (i + 1) + ":");
            persons[i].disp();
            System.out.println();
        }
    }
}
class Account {
    protected int acc_no;
    protected double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    private String name;
    private String aadhar_no;
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar number: ");
        aadhar_no = scanner.nextLine();
    }

    @Override
    public void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

*/
/*4. Aim of the program - Define an interface Employee with a method getDetails() to get
employee details as Empid and Ename. Also define a derived interface Manager with a
method getDeptDetails() to get department details such as Deptid and Deptname.Then
define a class Head which implements Manager interface and also prints all details of the
employee. Write the complete program to display all details of one head of the department.
Input - Enter employee id - 123
Enter employee name - Sidharth Ambani
Enter department id - 06
Enter department name -Marketing
Output - Employee id - 123
Employee name - Sidharth Ambani
Department id - 06
Department name -Marketing */

import java.util.*;

interface employee
{
	void getDetails();
}
interface manager extends employee
{
	void getDeptDetails();
}
class Head implements manager
{
	int empid,Deptid;
	String ename,Deptname;

	public void getDetails()
	{
		System.out.println("Employee id: "+empid);
		System.out.println("Employee name: "+ename);
	}
	public void getDeptDetails()
	{
		System.out.println("Department id: "+Deptid);
		System.out.println("Department name: "+Deptname);
	}
	public void printAllDetails()
	{
		getDetails();
		getDeptDetails();
	}
}

public class LAB5_4
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);

		Head head = new Head();
		System.out.print("Enter employee id: ");
		head.empid = scanner.nextInt();

		 System.out.print("Enter employee name: ");
		 head.ename = scanner.next();

		 System.out.print("Enter department id: ");
		        head.Deptid = scanner.nextInt();

		        System.out.print("Enter department name: ");
		        head.Deptname = scanner.next();

		        System.out.println("\nEmployee Details:");
        head.printAllDetails();
	}
}
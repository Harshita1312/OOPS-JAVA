/* 4. Aim of the program : Program to check a user entered number is palindrome or not
Input: Mention the number in the program
Output: display the number is Palindrome or not. */

import java.util.*;
public class LAB1_4
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int num;

     System.out.print("Enter number: ");
     num=in.nextInt();

     int n=num;
     int rev=0;

     while(n!=0)
     {
		 int digit= n%10;
		 rev= rev*10 + (digit);
		 n= n/10;
	 }
	 if(num == rev)
	    System.out.println("Palindrome number");
	 else if (num != rev)
	    System.out.println("Not Palindrome number");
	}
 }

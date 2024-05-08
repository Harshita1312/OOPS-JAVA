/* 5. Aim of the program : Write a program in Java to take first name and last name from user and
print both in one line as last name followed by first name
Input: Enter first name: KIIT
Enter Second Name: UNIVERSITY
Output: UNIVERSITY KIIT  */

import java.util.*;
public class LAB1_5
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     String first,last;

     System.out.print("Enter first name: ");
     first=in.nextLine();
     System.out.print("Enter last name: ");
     last=in.nextLine();
     System.out.print("Enter Output: ");
     System.out.println(last+" "+first);
 }
}


/*2. Aim of the program: Write a program to print the corresponding grade for the given
mark using if..else statement in Java
Input: Mention the grade in the program
Output: Display the Grade either O/E/A/B/C */

import java.util.*;
public class LAB1_2
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int marks;

     System.out.print("Enter marks: ");
     marks=in.nextInt();

     if(marks>=90)
        System.out.println("Grade : O ");
     else if (marks>=80 && marks<90)
        System.out.println("Grade : E ");
     else if (marks>=70 && marks<80)
        System.out.println("Grade : A ");
     else if (marks>=60 && marks<70)
        System.out.println("Grade : B ");
     else if (marks<60)
        System.out.println("Grade : C ");

   }
}
/* 1. Aim of the program -Write a program to print your name, roll no, section and branch in
separate lines.

Input: Mention Name,Roll no,Section and branch
Output: Display Name
Display Roll No
Display Section
Display Branch */

import java.util.*;
public class LAB1_1
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     Scanner in1 = new Scanner(System.in);
     String name,branch;
     long roll;
     int sec;

     System.out.print("Enter name: ");
     name=in.nextLine();
     System.out.print("Enter roll no: ");
     roll=in.nextLong();
     System.out.print("Enter section: ");
     sec=in.nextInt();
     System.out.print("Enter branch: ");
     branch=in1.nextLine();

     System.out.println("\n\nDetails are :");
     System.out.println("Name : "+name);
     System.out.println("Roll No. : "+roll);
     System.out.println("Branch : "+branch);
     System.out.println("Section : "+sec);
    }

}
/* 2. Aim of the program -Write a program to perform following operations on user entered strings and a character –
i) Change the case of the string
ii) Reverse the string
iii) Compare two strings
iv) Insert one string into another string
v) Convert the string to upper case and lower case
vi) Check whether the character is present in the string and at which position
vii) Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string

Input: Enter a String : amit
Output: The string after changing the case is AMIT
        The string after reversing is tima

Input: Enter the second string for comparision : kumar
Output: The difference between ASCII value is 10

Input: Enter the string to be inserted into first string : thakur
Output: The string after insertion is : amit thakur

Input: Enter a String : Amit
Output: Uppercase: AMIT
Lowercase: amit

Input: Enter a String :Amitkumar
Enter a character : m
Output: Position of entered character: 2

Input: Enter a String : Amitkumar
Enter a character : Y
Output: Entered character is not present

Input: Enter a String : madam
Output: Entered string is palindrome

Input: Enter a String : muscle
Output: Entered string is not a palindrome

Input: Enter a String : Ram is going to school
Output: No. of words: 5
No. of vowels: 7
No. of consonants: 11   */

import java.util.*;

class LAB6_2
{
	public static  void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		Scanner inn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int choice,i;
		int word=0, vowel=0, conso=0;
		String str1="", str2="", str3;

		String s = "      ram is a boy!     ";
		System.out.println(s.trim());
		System.out.println(s.stripTrailing());

		System.out.println("***MENU DRIVEN PROGRAM***");
		System.out.println("1) Change the case of the string");
		System.out.println("2) Reverse the string");
		System.out.println("3) Compare two strings");
		System.out.println("4) Insert one string into another string");
		System.out.println("5) Convert the string to upper case and lower case");
		System.out.println("6) Check whether the character is present in the string and at which position");
		System.out.println("7) Check whether the string is palindrome or not.");
		System.out.println("8) Check the number of word, vowel and consonant in the string");
		System.out.println("9) EXIT");
		do
		{
			System.out.print("ENTER YOUR CHOICE: ");
			choice=inn.nextInt();

			switch(choice)
			{
				case 1: System.out.print("Enter a String :");
				        str1=in.nextLine();
				        System.out.println("The string after changing the case is "+str1.toUpperCase());
				        break;
				case 2: System.out.print("Enter a String :");
				        str1=in.nextLine();
				        for(i=str1.length()-1; i>=0; i--)
				        {
							str2+=str1.charAt(i);
						}
				        System.out.println("The string after reversing is "+str2 );
				        break;
				case 3: System.out.print("Enter a String1 :");
				        str1=in.nextLine();
				        System.out.print("Enter a String2 :");
				        str2=in.nextLine();
				        System.out.println("The difference between ASCII value is "+str1.compareTo(str2));
				        break;
				case 4:
				case 5: System.out.print("Enter a String :");
				        str1=in.nextLine();
				        System.out.println("Uppercase: "+str1.toUpperCase());
				        System.out.println("Lowercase: "+str1.toLowerCase());
				        break;
				case 6: System.out.print("Enter a String :");
				        str1=sc.nextLine();
				        System.out.print("Enter a character to find in string :");
				        str2=in.next();
				        if(str1.contains(str2))
				        {
							System.out.println("Position of entered character: "+str1.indexOf(str2));
						}
						else
						{
							System.out.println("Entered character is not present");
						}
				        break;
				case 7: System.out.print("Enter a String :");
				        str1=in.nextLine();
				        for(i=str1.length()-1; i>=0; i--)
				        {
							str2+=str1.charAt(i);
						}
						if(str1.equals(str2))
						{
							System.out.println("Entered string is palindrome");
						}
						else
						{
							System.out.println("Entered string is not palindrome");
						}
				case 8: System.out.print("Enter a String :");
				        str1=in.nextLine().trim().toLowerCase();
				        System.out.println(str1);
				        for(char ch : str1.toCharArray())
						{
								switch(ch)
								{
									case ' ':word++;
									         break;
									case 'a':
									case 'e':
									case 'i':
									case 'o':
									case 'u':vowel++;
									         break;
									default:conso++;
									        break;
								}
						}
						System.out.println("no.of words: "+(word+1));
						System.out.println("no.of vowels: "+vowel);
						System.out.println("no.of consonant: "+conso);
				        break;
				case 9: System.out.println("exiting...");
				        break;
				default: System.out.println("invalid choice");
				         break;
		   }
		}while(choice!=9);
	}
}
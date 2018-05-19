package Pratice;

import java.util.Scanner;

public class Palindrome_String {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String To Check Palindrome or not");
		String s = sc.nextLine();
		String rev="";
		String temp;
		temp = s;
		int l = s.length();
		for (int i = l-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		if (rev.equals(s)) 
		{
			System.out.println("Enter String is palindrome");
		} else 
		{
			System.out.println("Enter String is not palindrome");
		}
	}

}

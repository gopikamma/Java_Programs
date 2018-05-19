package Pratice;

import java.util.Scanner;

public class abc123_def456 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		s1.toLowerCase();
		s2.toLowerCase();
		String c1="",n1="",c2="",n2="";
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i)>='a' & s1.charAt(i)<='z') 
			{
				c1 = c1+s1.charAt(i);
			}
			else
			{
				n1 = n1+s1.charAt(i);
			}
		}
		
		for (int i = 0; i < s2.length(); i++)
		{
			if (s2.charAt(i)>='a' & s2.charAt(i)<='z') 
			{
				c2 = c2+s2.charAt(i);
			}
			else
			{
				n2 = n2+s2.charAt(i);
			}
		}
		
		int one = Integer.parseInt(n1);
		int two = Integer.parseInt(n2);
		System.out.println("addition of two integers is :"+(one+two));
	}
	

}

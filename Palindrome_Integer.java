package Pratice;

import java.util.Scanner;

public class Palindrome_Integer {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check palindrome or not");
		int n = sc.nextInt();
		int temp = n;
		int a,r=0;
		while (n>0) 
		{
			a = n%10;
			r = r*10+a;
			n = n/10;
		}
		if (temp == r )
		{
			System.out.println("Enter Number is Palindrome");
		} else {
			System.out.println("Enter Number is not Palindrome");
		}
	}

}

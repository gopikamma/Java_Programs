package Pratice;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To check Even or odd");
		int n = sc.nextInt();
		if (n%2==0) 
		{
			System.out.println("Enter Number is Even Number");
		} else {
			System.out.println("Enter Number is odd Number");
		}

	}

}

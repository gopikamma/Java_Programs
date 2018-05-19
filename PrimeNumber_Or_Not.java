package Pratice;

import java.util.Scanner;

public class PrimeNumber_Or_Not {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Check Prime or Not");
		int n = sc.nextInt();
		boolean prime = true;
		for (int i = 2; i < n; i++)
		{
			if (n%i==0)
			{
				prime = false;
			}
		}
		
		if (prime==true) 
		{
			System.out.println("Enter Number is Prime Number");
		}
		else
		{
			System.out.println("Enter Number is Not Prime number");
		}
	}

}

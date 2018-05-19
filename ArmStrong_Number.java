package Pratice;

import java.util.Scanner;

public class ArmStrong_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To check Armstrong or not");
		int n = sc.nextInt();
		
		int a,c=0;
		int temp;
		temp=n;
		while (n>0) 
		{
			a = n%10;
			c = c+(a*a*a);
			n = n/10;
		}
		if (temp==c) 
		{
			System.out.println("Enter Number is Armstrong number");
		}
		else
		{
			System.out.println("Enter Number is Not Armstrong Number");
		}
	}

}

package Pratice;

import java.util.Scanner;

public class Fibonaci_WithoutRecrussion {

	public static void main(String[] args) 
	{
		int n1=0,n2=1,n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number For Count");
		int n =sc.nextInt();
		System.out.print(n1+"  "+n2);
		for (int i = 0; i <=n; i++)
		{
			n3 = n1+n2;
			System.out.print("  "+n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}

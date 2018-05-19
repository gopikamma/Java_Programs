package Pratice;

import java.util.Scanner;

public class Days_2_Year_Month_week {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Days");
		int n = sc.nextInt();
		int y = n/365;
		System.out.println("total No of Years is: "+y);
		
		int m = n/30;
		System.out.println("Total no of Months is: "+m);
		
		int w = n/7;
		System.out.println("Total Number of weeks is:  "+w);
		
	}

}

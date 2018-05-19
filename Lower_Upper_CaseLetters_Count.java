package Pratice;

import java.util.Scanner;

public class Lower_Upper_CaseLetters_Count {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	String s = sc.nextLine();
	
	int low=0,up=0;
	
	for (int i = 0; i < s.length(); i++)
	{
		if(s.charAt(i)>='a' & s.charAt(i)<='z')
		{
			low++;
		}
		else
		{
			up++;
		}
	}
	
	System.out.println("No of Lower Case Letters is :"+low);
	
	System.out.println("no of Upper Case Letters is :"+up);
	}

}

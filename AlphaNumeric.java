package Pratice;

import java.util.ArrayList;
import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphanumeric");
		String input = sc.nextLine();
		
		ArrayList<Character> ch = new ArrayList<>();
		ArrayList<Character> nu = new ArrayList<>();
		
		for (int i = 0; i < input.length(); i++)
		{
			char c = input.charAt(i);
			if (c>='a' & c<='z' || c>='A' & c<='Z')
			{
				ch.add(c);
			}
			else 
			{
				nu.add(c);
			}
		}
		
		System.out.println("Total no of Charaters is:  "+ch.size());
		
		System.out.println("Total no of Numerics is:  "+nu.size());
		
		for (Character cer : ch) 
		{
			System.out.println(cer);
		}
		
		System.out.println("************************");
		for (Character cher : nu)
		{
			System.out.println(cher);
		}
	}

	
}

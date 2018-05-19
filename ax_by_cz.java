package Pratice;

import java.util.Scanner;

public class ax_by_cz {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings");
		String one = sc.nextLine();
		String two = sc.nextLine();
		
		for (int i = 0,j=0; i <one.length() || j<two.length(); i++,j++) 
		{
			System.out.println(Character.toString(one.charAt(i))+Character.toString(two.charAt(j)));
		}
		
		System.out.println("**********************");
		
		for (int i = 0,j=two.length()-1; i <one.length() || j>=0; i++,j--) 
		{
			System.out.println(Character.toString(one.charAt(i))+Character.toString(two.charAt(j)));
		}
		
	}

}

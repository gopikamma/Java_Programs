package Pratice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Descending_words {

	public static void main(String[] args) 
	{
		String[] words = {"one","two","three","four","five"};
		Arrays.sort(words);
		System.out.println("               ");
		System.out.println("After sorting");
		System.out.println("               ");
		
		for (String string : words)
		{
			System.out.println(string);
		}
		
		System.out.println("*********************************");
		Arrays.sort(words,Collections.reverseOrder());
		
		System.out.println("               ");
		System.out.println("Reverse  sorting");
		System.out.println("               ");
		
		for (String string : words)
		{
			System.out.println(string);
		}
	}

}

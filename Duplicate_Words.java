package Pratice;

import java.util.HashSet;


public class Duplicate_Words {

	public static void main(String[] args)
	{
		String[] words = {"one","two","three","four","two","one"};
		HashSet<String> set = new HashSet<>();
		for (String string : words) 
		{
			if (!set.add(string))
			{
				System.out.println(string);
			}
		}
	}

}

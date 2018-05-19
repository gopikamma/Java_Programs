package Pratice;

import java.util.Arrays;

public class Second_HighestNumer {

	public static void main(String[] args) 
	{
		int[] num = {2,5,3,9,7};
		Arrays.sort(num);
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		System.out.println("Second Highest Number is:"+num[num.length-2]);
	}

}

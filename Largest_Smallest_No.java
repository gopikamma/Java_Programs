package Pratice;

public class Largest_Smallest_No {

	public static void main(String[] args)
	{
		int num[] = {7,100,88,55,22,66};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i : num)
		{
			if (i>largest)
			{
				largest = i;
			}
		}
		
		System.out.println("Largest Value is :"+largest);
		
		for (int i : num)
		{
			if (i<smallest) 
			{
				smallest = i;
			}
		}
		
		System.out.println("Smallest Number is :"+smallest);
	}

}

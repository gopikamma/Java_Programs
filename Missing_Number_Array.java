package Pratice;

public class Missing_Number_Array {

	public static void main(String[] args) 
	{
		int[] n = {1,2,3,4,5,6,8,9};
		int sum=0;
		for (int i = 0; i <8; i++)
		{
			sum = sum+n[i];
		}
		
		System.out.println("Total Array Addition is: "+sum);
		
		int sum1=0;
		for (int i = 0; i <10; i++)
		{
			sum1 = sum1+i;
		}
		
		System.out.println("Missing number is:"+(sum1-sum));
	}

}

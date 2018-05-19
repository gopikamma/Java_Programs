package Pratice;

public class Reverse_Integer {

	public static void main(String[] args) 
	{
		int n=54321,rev;
		int a,c=0;
		while (n>0) 
		{
			a = n%10;
			c = c*10+a;
			n = n/10;
		}
		
		System.out.println("Reverse of a number is :  "+c);
		
	}

}

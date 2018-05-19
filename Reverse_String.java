package Pratice;

public class Reverse_String {

	public static void main(String[] args)
	{
		String org="gopi",rev="";
		int l = org.length();
		for (int i = l-1; i>=0; i--)
		{
			rev = rev+org.charAt(i);
		}
		
		System.out.println("Reverse of a String is :"+rev);
	}

}

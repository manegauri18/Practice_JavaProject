package Logical_programs;

public class Example4_palindrome_string
{
	public static void main(String[] args)
	{
		String s1="madam";
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse string is: "+rev);
		
		if(s1.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

}

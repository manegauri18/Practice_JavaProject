package Logical_programs;

public class Example3_Reverse_string 
{
	public static void main(String[] args)
	{
		String s1="gauri";
		String rev="";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println("Reverse string is: "+rev);
		
	}

}

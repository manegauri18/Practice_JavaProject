package Loops;

//Example: Count number of words in a string

public class Example33 
{
	public static void main(String[] args) 
	{
		String s="Welcome to the world of software testing";
		int count=1;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in string are: "+count);
		
	}

}
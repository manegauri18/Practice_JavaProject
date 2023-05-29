package Loops;
//Count number of words in string
public class Example34
{
	public static void main(String[] args)
	{
		String s="Good afternoon, Have a nice day";
		int count=1;
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in string are: "+ count);
		
	}

}

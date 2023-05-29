package Logical_programs;

public class Example8_Palindrome_number 
{
	public static void main(String[] args)
	{
		int num=16461;  //54321
		int rev=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			rev=rev*10 + rem;
		}
		System.out.println("Rverse number is: "+rev);
		
		if(num==rev)
		{
			System.out.println("Given number is palindrome");
		}
		else
		{
			System.out.println("Given number is not palindrome");
		}
		
	}

}

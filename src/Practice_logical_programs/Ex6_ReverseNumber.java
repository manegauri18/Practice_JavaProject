package Practice_logical_programs;

public class Ex6_ReverseNumber 
{
	public static void main(String[] args) 
	{
		int orgNum=16461;
		
		String org = Integer.toString(orgNum);  //convert integer to string
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev= rev+ org.charAt(i);
		}
		
		//System.out.println(rev);
		
		int revNum = Integer.parseInt(rev);
		System.out.println(revNum);
		
		if(orgNum==revNum)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
	}

}

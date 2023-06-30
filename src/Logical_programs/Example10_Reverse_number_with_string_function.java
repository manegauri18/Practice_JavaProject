package Logical_programs;

public class Example10_Reverse_number_with_string_function 
{
	public static void main(String[] args) 
	{
		int orgNum=1234;
		
		String org = Integer.toString(orgNum);   //convert number to string (Integer is class & to string is method in it)
		
		String rev="";
		
		for(int i=org.length()-1; i>=0; i--)
		{
			rev= rev + org.charAt(i);
		}
		
	    int revNum = Integer.parseInt(rev);   //convert string to number
	    
	    System.out.println(revNum);
	}

}

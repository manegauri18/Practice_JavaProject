package Logical_programs;

public class Example12_PrintStatementInReverseOrder 
{
	public static void main(String[] args) 
	{
		String s1= "my name is gauri";
		
		String ar []= s1.split(" ");
		
		String rev="";
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}

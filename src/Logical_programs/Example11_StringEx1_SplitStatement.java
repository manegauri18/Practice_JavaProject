package Logical_programs;

public class Example11_StringEx1_SplitStatement 
{
	public static void main(String[] args) 
	{
		String s1="my name is gauri";
		
		String ar[]= s1.split(" ");
		
		System.out.println(ar[1]);
		System.out.println("--------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}

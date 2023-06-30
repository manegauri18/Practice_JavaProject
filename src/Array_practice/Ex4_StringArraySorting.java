package Array_practice;

import java.util.Arrays;

public class Ex4_StringArraySorting 
{
	public static void main(String[] args)
	{
		String ar []=new String[4];
		
		ar[0]="java";
		ar[1]="ruby";
		ar[2]="python";
		ar[3]="pearl";
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---Print data in ascending order---");
		Arrays.sort(ar);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---Print data in descending order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

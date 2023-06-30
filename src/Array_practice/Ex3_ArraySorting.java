package Array_practice;

import java.util.Arrays;

public class Ex3_ArraySorting 
{
	public static void main(String[] args) 
	{
		int ar []= {14,7,2,5,17};
		
		System.out.println(ar.length);
		
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

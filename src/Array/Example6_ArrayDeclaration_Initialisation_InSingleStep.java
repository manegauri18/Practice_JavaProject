package Array;

import java.util.Arrays;

public class Example6_ArrayDeclaration_Initialisation_InSingleStep 
{
	public static void main(String[] args) 
	{
		int ar []= {12,8,15,4,7};
		
		System.out.println(ar[3]);  //4
		System.out.println(ar.length);   //5
		
		System.out.println("---Print array in reverse order------");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("-----Print array in ascending order-----");
		Arrays.sort(ar);
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}

package Array;

import java.util.Arrays;

public class Example7_StringArrayDeclaration_Initialization_InSingleStep 
{
	public static void main(String[] args) 
	{
		String ar []= {"Neel", "Gauri", "Sagar", "Ansh"};
		
		System.out.println(ar.length);  //4
		
		System.out.println("----Print original array info-----");
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		Arrays.sort(ar);  //array:default class & sort:static method present in that arrays class
		
		System.out.println("----Print String in alphbetical order----");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}

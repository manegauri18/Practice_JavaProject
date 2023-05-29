package Array;

import java.util.Arrays;

public class Example5_StringArraySorting 
{
	public static void main(String[] args)
	{
		//step1: Array declaration
				String ar []=new String[5];
				
				//Step2: Array initialization
				ar[0]="Neel";
				ar[1]="Gauri";
				ar[2]="Sagar";
				ar[3]="Om";
				ar[4]="Akshu";
				
				//Step3: Array usage
				System.out.println(ar[2]);
				System.out.println(ar[4]);
		

		Arrays.sort(ar);
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
	}

}

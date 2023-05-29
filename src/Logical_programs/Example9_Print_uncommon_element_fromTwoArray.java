package Logical_programs;

public class Example9_Print_uncommon_element_fromTwoArray 
{
	public static void main(String[] args)
	{
		int [] ar1= {10,20,30,40,50,60};
		int [] ar2= {10,20,70,90,50,60};
		
		for(int i=0; i<=5; i++)
		{
			if(ar1[i]!=ar2[i])
			{
				System.out.println(ar1[i]+"  "+ar2[i]);
			}
		}
		
	}

}

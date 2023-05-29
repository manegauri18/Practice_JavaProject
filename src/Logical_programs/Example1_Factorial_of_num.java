package Logical_programs;

public class Example1_Factorial_of_num 
{
	public static void main(String[] args)
	{
		int num=5;  //5*4*3*2*1
		int fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of 5 is: "+fact);
		
	}

}

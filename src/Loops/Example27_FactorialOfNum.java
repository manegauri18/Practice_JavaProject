package Loops;

public class Example27_FactorialOfNum 
{
    public static void main(String[] args) 
    {
		int num=7;
		int fact=1;
		
		for(int i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of num is:" + fact);
	}
}

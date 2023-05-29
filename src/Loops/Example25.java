package Loops;

public class Example25 
{
   //Example: Factorial of given number 5---->5*4*3*2*1
	
	public static void main(String[] args) 
	{
	   int num=5;
	   int fact=1;  //120
	   
	   for(int i=num; i>=1; i--)
	   {
		   fact=fact*i;
	   }
	   
	   System.out.println("Factorial of 5 is: "+ fact);
	   
	}
}

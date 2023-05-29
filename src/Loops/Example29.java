package Loops;

public class Example29 
//Factorial of number 4
{
   public static void main(String[] args)
   {
	
	   int num=4;
	   int fact=1;
	   
	   for(int i=num; i>=1; i--)
	   {
		   fact=fact*i;
		   
	   }
	   
	   System.out.println("Factorial of 4 is: "+ fact);
}
}

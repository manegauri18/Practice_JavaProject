package Loops;

public class Example28 
{
  //program that takes a number as 5 input and prints its multiplication table upto 10.
	
	public static void main(String[] args) 
	{
	  
		int num=5;
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
	}
}

package Logical_programs;
//Swap two numbers using third variable
public class Example5_Swap_two_numbers 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		int temp;
		
		System.out.println("----Numbers before swapping are----");
		System.out.println("Number 1 is: "+num1);
		System.out.println("Number 2 is: "+num2);
		
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("----Numbers after swapping are----");
		System.out.println("Number 1 is: "+num1);
		System.out.println("Number 2 is: "+num2);
		
	}

}

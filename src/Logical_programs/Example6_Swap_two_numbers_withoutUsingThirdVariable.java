package Logical_programs;

public class Example6_Swap_two_numbers_withoutUsingThirdVariable 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		
		System.out.println("----Before swap----");
		System.out.println("First number: "+num1);
		System.out.println("Second number: "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("----After swap----");
		System.out.println("First number: "+num1);
		System.out.println("Second number: "+num2);
		
	}

}

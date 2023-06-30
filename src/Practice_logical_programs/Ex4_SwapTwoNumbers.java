package Practice_logical_programs;

public class Ex4_SwapTwoNumbers 
{
	public static void main(String[] args)
	{
		int num1=4;
		int num2=7;
		int temp;
		
		System.out.println("--numbers before swap---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("--numbers after swap---");
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
		
	}

}

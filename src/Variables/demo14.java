package Variables;

public class demo14 
{
   //Divide two numbers using non static method
	
	public static void main(String[] args) 
	{
		demo14 d14=new demo14();
		d14.division(50,3);
		
	}
	
	public void division(int num1, int num2)
	{
		System.out.println("division of 2 numbers is: "+ num1/num2);
	}
}

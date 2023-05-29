package Access_Specifiers;
//Overloading private method
public class Overloading_private_methods 
{
	private void addition(int num1, int num2)
	{
		System.out.println(num1+num2);
	}
	
	private void addition(int num3, int num4, int num5)
	{
		System.out.println(num3+num4+num5);
	}
	
	public static void main(String[] args) 
	{
		Overloading_private_methods s=new Overloading_private_methods();
		s.addition(5, 20);
		s.addition(10, 5, 4);
		
	}

}

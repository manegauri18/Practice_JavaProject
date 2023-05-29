package Abstract_concrete_class;
//abstract class
abstract public class demo1 
{
	public void addition(int num1, int num2)
	{
		System.out.println(num1+num2);    //method definition
	}
	
	public void sub(int num3, int num4)
	{
		System.out.println(num3-num4);
	}
	
	//incomplete method or abstract method
	abstract public void m1();    //method declaration
	
	//incomplete method or abstract method
	abstract public void m2();
	

}

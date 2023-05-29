package Multiple_inheritance_using_interface;
//Example of multiple inheritance using interface
//implementation class
public class Sample1 implements I1, I2
{
	public void m1()
	{
		System.out.println("Method m1 from I1 completed in implementation class");
	}
	
	public void m2()
	{
		System.out.println("Method m2 from I1 completed in implementation class");
	}

	public void m3()
	{
		System.out.println("Method m3 from I2 completed in implementation class");
	}

	public void m4()
	{
		System.out.println("Method m4 from I2 completed in implementation class");
	}


}

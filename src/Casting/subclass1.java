package Casting;

public class subclass1 extends superclass1
{
	public void addition(int num1, int num2)    //own property
	{
		System.out.println(num1+num2);
	}
	
//    String sname;
	
	public void m1()
	{
		System.out.println("Running method m1 completed in childclass");  //override
	}
	
	public void m2()
	{
		System.out.println("Running method m2 completed in childclass");   //override
	}
	
//	public void m3()
//	{
//		System.out.println("Running method m3 completed in superclass");
//	}


}

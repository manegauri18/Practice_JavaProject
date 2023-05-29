package Casting;

public class Test_demo 
{
	public static void main(String[] args) 
	{
		//creating object of subclass with reference of super class--->Up casting
		demo1 d1=new demo2();
		d1.car();
		d1.money();
		d1.home();
		
		System.out.println("-----------------------");
		//down casting
		demo2 d2=(demo2)d1;
		d2.laptop();
		d2.car();
		d2.money();
		d2.home();
		
		
	}

}

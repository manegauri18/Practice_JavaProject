package Casting;

public class Test_Sample 
{
	public static void main(String[] args)
	{
		//Upcasting
		Sample1 s1 = new Sample2();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("------------------------");
		
		//Downcasting
		Sample2 s2 = (Sample2)s1;
		s2.car();
		s2.money();
		s2.home();
		s2.laptop();
		
	}

}

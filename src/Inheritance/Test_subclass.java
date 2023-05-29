package Inheritance;

public class Test_subclass 
{
	public static void main(String[] args) 
	{
		System.out.println("-----Features of subclass1---------");
		subclass1 s1=new subclass1();
		s1.bike();
		s1.car();
		s1.money();
		s1.home();
		
		System.out.println("--------Features of subclass2-------");
		subclass2 s2=new subclass2();
		s2.mobile();
		s2.car();
		s2.money();
		s2.home();
		
		System.out.println("--------Features of subclass3---------");
		subclass3 s3=new subclass3();
		s3.laptop();
		s3.car();
		s3.money();
		s3.home();
		
	}

}

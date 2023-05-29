package Casting;

public class mainclass1
{
	public static void main(String[] args)
	{
		//Up casting
		superclass1 s=new subclass1();
		s.sname="Neel";
		System.out.println(s.sname);
		s.m1();
		s.m2();
		s.m3();
		
	System.out.println("----------------------------------");	
		
		//Down casting
   //child class obj=parentclassObjName(childClass)		
		subclass1 s1=(subclass1)s;
		s1.addition(10, 15);
		s1.sname="Gauri";
		System.out.println(s1.sname);
		s1.m1();
		s1.m2();
		s1.m3();
	}

}

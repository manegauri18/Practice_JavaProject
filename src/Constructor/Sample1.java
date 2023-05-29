package Constructor;

public class Sample1 
{
	 public static void main(String[] args) 
	   {
		 
		   //Example1:default constructor created by compiler
		   
		   //ClassName()
		   // {
			   
		   //}
	       Sample1 s1=new Sample1();  //--->Sample1=data type, s1=object name, new=empty object,
	                                       //---> Sample1()=constructor
	       s1.m1();                  //Non static regular method call from same class
	   
	       m2();                     //static regular method call from same class
	   
	       System.out.println("--------------------");
	       
	       Sample2 s2=new Sample2();    //Sample2=default constructor of class--> Sample2
	       s2.m3();                    //non static method m3 call from diff class
	       
	   } 
		public void m1()
		{
			System.out.println("Running non static regular method m1");
		}
		
		public static void m2()
		{
			System.out.println("Running static regular method m2");
		}
}

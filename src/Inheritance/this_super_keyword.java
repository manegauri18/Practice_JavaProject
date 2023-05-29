package Inheritance;

public class this_super_keyword extends superClass
{
  
	int a=10;  //global variable
	
	public void m1()
	{   
		int a=20;   //local variable
		System.out.println(a);  //local variable usage
		System.out.println(this.a);  //global variable usage from same class using 'this' keyword
		
		System.out.println(super.a); //global variable usage from super class using 'super' keyword
	}
	
	public static void main(String[] args) 
	{
		this_super_keyword t1=new this_super_keyword();
				t1.m1();
	}
}

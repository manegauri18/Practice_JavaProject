package Constructor;

public class Sample5_user_defined_constructor 
{

	int a;   //step1: global variable declaration
	int b;    //use1:global variable initialisation
	         //use2:copy all member of class into object
	
	Sample5_user_defined_constructor()   //user defined constructor
	{
		a=15;  //step2: global variable initialisation
		b=30;
	}
	
	public void addition()
	{
		System.out.println(a+b);  //step3: global variable usage
	}
	
	public void multi()
	{
		System.out.println(a*b);
	}
	
	public static void main(String[] args) 
	{
		Sample5_user_defined_constructor s5=new Sample5_user_defined_constructor();
		s5.addition();  //45     //user defined method call from same class
		s5.multi();    //450
		
		System.out.println("--------------------------");
		
		Sample6 s6=new Sample6();
		s6.m3();
	}
}

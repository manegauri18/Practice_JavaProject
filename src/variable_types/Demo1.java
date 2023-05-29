package variable_types;

public class Demo1     //Ex. Local & global variable
{  
	int b=8;   //global variable
 
	public static void main(String[] args) 
   {
	int a=15;    //local/temporary variable
	System.out.println(a);
	
	Demo1 d1=new Demo1();
	d1.m1();
	d1.m2();
	   
   }
   
   public void m1()
   {
	   System.out.println(b);
   }
   
   public void m2()
   {
	   System.out.println(b);
   }
   
   
   
   
}

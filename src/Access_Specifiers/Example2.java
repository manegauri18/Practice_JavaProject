package Access_Specifiers;
//Default access specifiers
public class Example2 
{
	int a;
	
	Example2()
	{
		a=10;
	}
	
    void m1()
    {
    	System.out.println("Running methosd m1");
    	
    }
    
    public static void main(String[] args)
    {
    	Example2 e2=new Example2();
    	e2.m1();
    	System.out.println(e2.a);
		
	}

}

package Method_with_return_type;

public class demo1
{
	public static int addition(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub(int l, int m)
	{
		int substraction=l-m;
		return substraction;
	}
	
	public static void main(String[] args) 
	{
		int num1 = addition(10, 20);   // ---->approach1 for method(addition)
		System.out.println(num1);
		
		System.out.println("--------------------");
		
		System.out.println(addition(5, 8));  // ---->approach2 
		
		System.out.println("-------------------");
		
		demo1 d1=new demo1();            //  ------->approach1 for method(sub)
		int num2 = d1.sub(50, 30);
		System.out.println(num2);
		System.out.println("-----------------");
		
		System.out.println(d1.sub(70, 35));   //  ------->approach2 for method(sub)
		System.out.println("------------------------");
		
		demo2 d2=new demo2();
		String studentName = d2.convertNametoUpperCase("gauri");
		System.out.println(studentName);
		
		System.out.println(d2.convertNametoUpperCase("sagar"));
	}

}

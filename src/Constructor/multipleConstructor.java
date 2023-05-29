package Constructor;

//Example:Multiple constructor or constructor overloading

public class multipleConstructor 
{
    int num1;
    int num2;
    String sname;
    
    //user defined with zero parameter constructor
    multipleConstructor()
    {
    	num1=20;
    	num2=10;
    }
    
    //user defined constructor with int, int parameter
    multipleConstructor(int a, int b)
    {
    	num1=a;
    	num2=b;
    }
    
    
    //user defined constructor with string parameter
    multipleConstructor(String sn)
    {
    	sname=sn;
    }
    
    public void add()
    {
    	System.out.println(num1+num2);
    }	
    	
    public void student()
    {
    	System.out.println(sname);
    }
    
    
    public static void main(String[] args) 
    {
    	multipleConstructor m1=new multipleConstructor();
    	m1.add();
    	
    	multipleConstructor m5 =new multipleConstructor(20,5);
    	m5.add();
    	
    
    	System.out.println("-----------------------------------");
    	
    	multipleConstructor m3=new multipleConstructor("Gauri");
    	m3.student();
	}
}

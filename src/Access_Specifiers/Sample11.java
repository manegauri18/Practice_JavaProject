package Access_Specifiers;


//Example2: Default access specifier

public class Sample11 
{
    int a;   //default---> access specifier
    
    Sample11()
    {
    	a=10;     //default---> access specifier
    }
    
    void Cube_of_num()       //default---> access specifier
    {
    	System.out.println(a*a*a);
    }
    
    public static void main(String[] args) 
    {
    	Sample11 s11=new Sample11();
    	s11.Cube_of_num();
    	System.out.println(s11.a);
		
	}
}

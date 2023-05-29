package methodwithparameter;

public class Sample4 
{

	public static void main(String[] args) 
	{
	
		division(35,7,10);           //static regular method call from same class
		division(90,10,15);
		
		Sample4 s4=new Sample4();     //non static regular method call from same class
		s4.addition(10,80);
		
		
		Sample5.multipli(15,5);      //static regular method call from diff class
		
		Sample5 s5=new Sample5();    //non static regular method call from diff class
		s5.subtract(250,350);
		
		
		
		
		
	}

    public static void division(int num1,int num2,int num3)
    {
    	System.out.println(num1/num2 + num3);
    }


    public void addition(int num1,int num2)
    {
    	System.out.println(num1+num2);
    }


}






package Casting;

//sub or child class
public class son extends Father
{
   public void bike()
   {
	   System.out.println("Bike: FZ");   //own property of son
   }
   
   public void car()
	{
		System.out.println("car: Kia");   //method override
	}
	
	public void money()
	{
		System.out.println("money: 4L");   //method override
	}
	
//	public void home()
//	{
//		System.out.println("home: 2BHK");
//	}
}

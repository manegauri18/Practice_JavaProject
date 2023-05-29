package Access_Specifiers;

public class Sample21 
{
	//Example: protected access specifier
	
	protected int c;
	
	protected Sample21()
	{
		c=40;
	}
	
	protected void SquareOfNum()
	{
		System.out.println(c*c);
	}
	
	public static void main(String[] args) 
	{
		Sample21 s21=new Sample21();
		s21.SquareOfNum();
		System.out.println(s21.c);
		
	}

}

package Pattern_programs;

public class Star_pattern4 
{
	public static void main(String[] args) 
	{
		//*
		//**
		//***
		//****
		
		int star=1;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
		}
		
	}

}

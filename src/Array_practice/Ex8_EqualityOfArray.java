package Array_practice;

import java.util.Arrays;

public class Ex8_EqualityOfArray 
{
	public static void main(String[] args) 
	{
		int ar1 []= {1,2,3,4,5};
		int ar2 []= {1,2,3,4,5};
		
		boolean result = Arrays.equals(ar1, ar2);
		
		if (result==true)
		{ 
			System.out.println("Arrays are equal");
		} 
		else 
		{
            System.out.println("Arrays are not equal");
		}
		
		
		
		
	}

}

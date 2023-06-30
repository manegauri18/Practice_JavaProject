package Array_practice;

import java.util.Arrays;

public class Ex6_MultiArray2 
{
    public static void main(String[] args)
    {
    	int ar[][]= {{2,5,10,15},{4,13,8,2}};
//    
//    	 0 1  2  3
//    0  2 5 10 15
//    1	 4 13 8 2
    	
    	for(int i=0; i<=1; i++)
    	{
    		for(int j=0; j<=3; i++)
    		{
    		System.out.print(ar[i][j]+" ");	
    		}
    		System.out.println();
    	}
    	
    	Arrays.sort(ar);
    	
    	
    	for(int i=0; i<=1; i++)
    	{
    		for(int j=0; j<=3; i++)
    		{
    		System.out.print(ar[i][j]+" ");	
    		}
    		System.out.println();
    		
    		
    	}
    		
    	
    	
    	
    	
    	
    	
    	
		
	}
}

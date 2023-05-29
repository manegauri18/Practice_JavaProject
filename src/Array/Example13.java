package Array;

public class Example13
{
	public static void main(String[] args)
	{
		int [][] ar1= {{10,20,30},{40,50,60}};  //2*3 10 20 30    20 25 30
		int [][] ar2= {{20,25,30},{40,45,50}};  //    40 50 60    40 45 50
		int [][] ar_total=new int[2][3];
		
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				ar_total[i][j]=((ar1[i][j])+(ar2[i][j]));
			  System.out.print(ar_total[i][j]+" ");
			} 
			System.out.println();
		}
		
		
	
	}

}

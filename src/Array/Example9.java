package Array;

public class Example9
{
	public static void main(String[] args)
	{
		//2*3 multi-dimensional array
		//		j-->     0  1 2  3
				//i  0  20 40 10 20
				//   1  10 30 70 60
		
		int ar [][]= {{20,40,10,20},{10,30,70,60}};
		
		System.out.println(ar[0][2]);  //10
		
		System.out.println("----Print all info----");
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=3; j++)
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}

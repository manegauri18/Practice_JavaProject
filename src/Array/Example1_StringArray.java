package Array;

public class Example1_StringArray 
{
	public static void main(String[] args) 
	{
		//step1: Array declaration
		String ar []=new String[5];
		
		//Step2: Array initialization
		ar[0]="Neel";
		ar[1]="Gauri";
		ar[2]="Sagar";
		ar[3]="Om";
		ar[4]="Akshu";
		
		//Step3: Array usage
		System.out.println(ar[2]);
		System.out.println(ar[4]);
		
		//To find length of string use syntax (array object name.length)
		System.out.println(ar.length);   //length is attribute stored in array object
		
		System.out.println("-----Print all data of string array--------");
		
//		for(int i=0; i<=4; i++)
//		{
//			System.out.println(ar[i]);
//		}
		
		//OR
		
		for(int i=0; i<=ar.length-1; i++)  //here for finding end index (ar.length-1)is used
		{
			System.out.println(ar[i]);
		}
		
	}

}

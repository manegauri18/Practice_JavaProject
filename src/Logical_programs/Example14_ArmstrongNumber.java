package Logical_programs;

public class Example14_ArmstrongNumber
{
	public static void main(String[] args) 
	{
		int OrgNum = 370;
		
		int sum = 0;    //	153

		
        for (int i = OrgNum;  i > 0;  i = i / 10)//------->we use i/10 to delete the last digit
         {
	         int rem = i % 10;   //------->we use rem to get the last digit
	         sum = sum + (rem * rem * rem);   
         }


          if (OrgNum == sum)  
          {
	        System.out.println("given number " + OrgNum + " is an armstrong number");
          } 
          else 
          {
	        System.out.println("given number " + OrgNum + " is not an armstrong number");
          }


		
	}

}

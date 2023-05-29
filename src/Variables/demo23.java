package Variables;
//Count Occurrences of a Character in a String
public class demo23 
{
   public static void main(String[] args) 
	{
		String s="Java programming java oops";
		int total_count=s.length();
		int total_count_afterRemove=s.replace("a", "").length();
		
		int count=total_count-total_count_afterRemove;
		
		System.out.println("Number of occurances of a in string are: "+count);
		

	}

}
 
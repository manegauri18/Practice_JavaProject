package String_class;

public class Sample5
{
	public static void main(String[] args) {
		
	    String s1="I am learning java";
	
	    String ar []=s1.split(" ");
	
	    System.out.println(ar[1]);  //am
	    System.out.println(ar.length);  //4
	    
	    System.out.println("------------------------");
	    
	    for(int i=0; i<=ar.length-1; i++)
	    {
	    	System.out.println(ar[i]);
	    }
	
	}

}

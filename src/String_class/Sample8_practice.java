package String_class;

public class Sample8_practice 
{
	public static void main(String[] args) 
	{
		String s1="velocity";
		String s2="";
		String s3="I am learning java";
		String s4="VELOCITY";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0, 4));
		
		System.out.println(s3.replace("java", "python"));
		System.out.println(s1.lastIndexOf('y'));
		System.out.println(s1.indexOf('l'));
		System.out.println(s3.contains("java"));
		
		System.out.println(s1.concat(s4));
		System.out.println(s1.length());  //8
		System.out.println(s2.isEmpty());  //true
		System.out.println(s1.isEmpty()); //false
		System.out.println(s1.charAt(4));   //c
		System.out.println(s1.equals(s4));  //false
		System.out.println(s1.equalsIgnoreCase(s4));   //true
		System.out.println(s3.startsWith("I"));  //true
		System.out.println(s3.endsWith("java"));  //true
		System.out.println("----Split method----");
		
		String[] ar = s3.split(" ");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		
		
		
		
		
		
		
		
		
	}

}

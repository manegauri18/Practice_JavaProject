package String_class;

public class Sample4 
{
	public static void main(String[] args)
	{
		String s1="selenium";
		String s2="";
		String s3="JAVA";
		String s4="I am learning java";
		String s5="java";
		String s6="abcabcab";
		
		
		System.out.println(s4.replace("java", "python"));//I am learning python
		
		System.out.println("------------------------------------");
		System.out.println(s4.startsWith("I"));  //true
		System.out.println(s4.endsWith("java"));  //true
		
		System.out.println("-------------------------------------");
		System.out.println(s1.substring(4));  //nium
		System.out.println(s1.substring(1, 4));//ele
		
		System.out.println("-------------------------------------");
		System.out.println(s3.concat(s5));
		
		System.out.println("-----------------------------------------");
		System.out.println(s6.indexOf('b'));   //1
		System.out.println(s6.lastIndexOf('c'));  //5
		
		System.out.println("-------------------------------------");
		System.out.println(s1.length());  //8
		System.out.println(s2.isEmpty());  //true
		System.out.println(s1.isEmpty());   //false
		System.out.println("----------------------------");
		
		System.out.println(s1.toUpperCase());   //SELENIUM
		//But if you want to print selenium word permanently in uppercase then use below approach
		//s1=s1.toUpperCase();
		//System.out.println(s1);
		
		System.out.println(s3.toLowerCase());  //JAVA
		
		System.out.println(s4.contains("learning"));
		System.out.println("-------------------------------------");
		
		System.out.println(s3.equals(s5));  //false
		System.out.println(s3.equalsIgnoreCase(s5));  //true
		System.out.println("````````````````````````````````````````````````````");
		
		System.out.println(s1.charAt(6));  //u
		System.out.println(s4.charAt(3));  //m
		
		
		
		
		
	}

}

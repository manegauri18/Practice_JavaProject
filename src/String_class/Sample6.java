package String_class;

public class Sample6 
{
	public static void main(String[] args) 
	{
		String s1="Automation";    String s2="";        String s3="abc";
		String s4="ABC";           String s5="I am learning java";      String s6="xyzxyzx";
		
		System.out.println(s1.length());  //10
		
		System.out.println(s2.isEmpty());  //true
		
		System.out.println(s3.concat(s4));  //abcABC
		
		System.out.println(s5.replace("java", "selenium")); // I am learning selenium
		
		System.out.println(s3.toUpperCase());   //ABC
		
		System.out.println(s4.toLowerCase());   //abc
		
		System.out.println(s1.substring(4));   //mation
		System.out.println(s1.substring(2, 7));  //tomat
		
		System.out.println(s5.startsWith("I"));  //true
		
		System.out.println(s5.endsWith("java"));  //true
		
		System.out.println(s1.indexOf("t"));  //2
		
		System.out.println(s6.lastIndexOf("z"));  //5
		
		System.out.println(s3.equals(s4));  //false
		
		System.out.println(s3.equalsIgnoreCase(s4)); //true
		
		System.out.println(s1.charAt(4));  //m
		
		System.out.println(s5.contains("learning"));   //true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

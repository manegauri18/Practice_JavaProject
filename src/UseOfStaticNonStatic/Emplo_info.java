package UseOfStaticNonStatic;

public class Emplo_info
{ 
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.empName="Sagar";
		s1.empId=101;
	//	s1.empCeoName="abc";
		
		System.out.println("----------------------");
		
		Sample1 s2=new Sample1();
		s2.empName="Gauri";
		s2.empId=102;
	//	s2.empCeoName="abc";
		
		System.out.println("-------------------------");
		
		Sample1 s3=new Sample1();
		s3.empName="Neel";
		s3.empId=103;
		//s3.empCeoName="xyz";
		
		s1.empInfo();
		s2.empInfo();
		s3.empInfo();
	}

}

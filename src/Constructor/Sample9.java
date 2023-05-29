package Constructor;

public class Sample9 
{
  String sname;
  int srollno;
  String sstd;
  String sclg;
  
  Sample9(String sn, int srn, String ss, String scl)
  {
	  sname=sn;
	  srollno=srn;
	  sstd=ss;
	  sclg=scl;
	  
  }
  
  public void m1()
  {
	  System.out.println("Details of student: "+ sname+" "+srollno+" "+sstd+" "+ sclg);
  }
	
  public static void main(String[] args) 
  {
	  Sample9 s9=new Sample9("Gauri", 101, "FE", "Sinhgad clg of engineering");
	  s9.m1();
	  
	  System.out.println("--------------------------------------------------------");
	  
	  Sample9 s10=new Sample9("Jyoti", 102, "SE", "Singhgad clg of engineering");
	  s10.m1();
	  
	  System.out.println("----------------------------------------------------------");
	  
	  Sample9 s11=new Sample9("Shradha", 103, "BE", "singhgad clg of engineering");
	  s11.m1();
}	
	
	
}

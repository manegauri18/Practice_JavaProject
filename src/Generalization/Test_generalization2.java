package Generalization;

public class Test_generalization2 
{
	public static void main(String[] args) 
	{
	Current_act s1=new Current_act();
	s1.CD();
	s1.CW();
	s1.MT();
	s1.featureA();
	
	System.out.println("----Features of saving act----");
	Saving_act s2=new Saving_act();
	s2.CD();
	s2.CW();
	s2.MT();
	s2.featureB();
	
	System.out.println("----Features of salary act----");
	Salary_act s3=new Salary_act();
	s3.CD();
	s3.CW();
	s3.MT();
	s3.featureC();
	
	}
	
	

}

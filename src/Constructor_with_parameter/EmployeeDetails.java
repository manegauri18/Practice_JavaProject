package Constructor_with_parameter;

public class EmployeeDetails 
{
   String empname;
   int empid;
   String empdept;
   String empcname;
   
   EmployeeDetails(String en, int eid, String ed, String ecn)
   {
	   empname=en;
	   empid=eid;
	   empdept=ed;
	   empcname=ecn;
   }
   
   public void m1()
   {
	   System.out.println("Employee details:"+ empname+" "+empid+" "+empdept+" "+empcname);
   }
   
   public static void main(String[] args) 
   {
	   EmployeeDetails e1=new EmployeeDetails("Sagar",50,"IT","Infosys");
	   e1.m1();
	   
	   System.out.println("-------------");
	   
	   EmployeeDetails e2=new EmployeeDetails("Gauri",51,"Mech","Saikrupa industries");
	   e2.m1();
	   
	   System.out.println("---------------------");
	   
	   EmployeeDetails e3=new EmployeeDetails("Neel",52,"ENTC","xyz");
	   e3.m1();
	   
}
}

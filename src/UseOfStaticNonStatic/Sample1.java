package UseOfStaticNonStatic;

public class Sample1 
{
    String empName;
    int empId;
    static String empCeoName;
    
    public void empInfo()
    {
    	System.out.println(empName+": "+empId+": "+empCeoName);
    }
}

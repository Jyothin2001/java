 public class EmployeeRunner
{

public static void main(String[] args)
{
  EmployeeDetails obj=new EmployeeDetails("suri","male",(byte)24,25000);
  obj.details(); // non-static method invoking
  
   EmployeeDetails obj1=new EmployeeDetails("jyo","male",(byte)24,25000);
  obj.details();
  
  EmployeeDetails.detail(); // static method invoking

}
}

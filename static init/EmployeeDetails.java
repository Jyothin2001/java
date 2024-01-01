public class EmployeeDetails
{
static  String companyName;
static String ceo;
static int companyLaptop;

String employeeName;
String gender;
byte age;
int salary;

  EmployeeDetails(String employeeName,String gender,byte age,int salary) // non-static variables initialzation
  {
      this.employeeName=employeeName;
	  this.gender=gender;
	  this.age=age;
	  this.salary=salary;
  }
   static  // static variables initialzation
   {
       companyName="TCS";
       ceo="suma";
       companyLaptop=1;
  }
  
  void details() // non static method
  {
	  System.out.println(employeeName);
	  System.out.println(gender);
	  System.out.println(age);
	  System.out.println(salary);
	  
}
static void detail()  //static method
{
	  System.out.println("static= "+companyName);
	  System.out.println("static= "+ceo);
	  System.out.println("static= "+companyLaptop);
  }
	

}


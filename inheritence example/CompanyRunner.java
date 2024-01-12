public class CompanyRunner
{
public static void main(String[] args)
{
  Employee1 emp=new Employee1(false,(byte)29);
	
  Manager man=new Manager(12000,true);
	
  Company1 comp= new Company1(emp,man,"ram","raj");
  comp.handlesChallenges();
  System.out.println(comp.ceo);
  
  comp.employee.work();
  System.out.println(comp.employee.isOnVacation);
  
  comp.manager.conductMeeting();
  System.out.println(comp.manager.isBusy);
  
  
  System.out.println("----------------------------------------"); 
  
  Software soft=new Software(765.678d,true);
  
  Data data=new Data(577,true);
  
  It it=new It(12,656.989d,soft,data,emp,man,"kumari","kumar");      
  it.software.displayInfo();            //method
  System.out.println(it.noOfEmployee); //variable 
  it.data.process();
  System.out.println(it.manager.isBusy);
  
  it.employee.work();
  
  
  
  
  
  
   System.out.println("----------------------------------------"); 
  
  //it.Company1.handlesChallenges();//
  
  Accounting acc=new Accounting(true,5678);
  
  Quality quality=new Quality(true,true);
  
  Bpo bpo= new Bpo(true,1999,acc,quality,emp,man,"kumari","kumar");
  bpo.accounting.calculateRevenue();
  bpo.quality.maintainAccuracy();
  System.out.println(bpo.quality.isAccurate);// aggre-variable
  
  bpo.manager.finishMeeting();
  
  
  
   
}

}
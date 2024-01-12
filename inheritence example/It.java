public class It extends Company1
{
	
int noOfEmployee;
double revenue;

Software software;  // aggregation
Data data;           // aggregation


It(int noOfEmployee,double revenue,Software software,Data data,Employee1 employee,Manager manager,String name,String ceo)
{
	
	this.noOfEmployee=noOfEmployee;
	this.revenue=revenue;
	this.software=software;
	this.data=data;
	this.employee=employee;
	this.manager=manager;
	this.name=name;
	this.ceo=ceo;
	
	
}

void developSoftware()
{
	System.out.println(" IT=develop Software");
}
void releaseProduct()
{
	System.out.println(" IT=release Product");
}

}
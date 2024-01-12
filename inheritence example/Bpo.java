public class Bpo extends Company1
{
	
boolean isInternational;
int establishedYear;

Accounting accounting; // aggregation
Quality quality;       // aggregation

Bpo(boolean isInternational,int establishedYear,Accounting accounting,Quality quality,Employee1 employee,Manager manager,String name,String ceo)
{
	this.isInternational=isInternational;
	this.establishedYear=establishedYear;
	this.accounting=accounting;
	this.quality=quality;
	this.employee=employee;
	this.manager=manager;
	this.name=name;
	this.ceo=ceo;
	
}


void provideCoustomerSupport()
{
	System.out.println("Bpo=provide Coustomer Support");
}
void handleOutSourcingProject()
{
	System.out.println("Bpo=handle Out Sourcing Project");
	
}
}



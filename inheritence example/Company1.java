public class Company1 
{
	
Employee1 employee; // aggregation
Manager manager;   // aggregation

String name;
String ceo;

Company1()
{
}


 Company1(Employee1 employee,Manager manager,String name,String ceo)
{
	this.employee=employee;
	this.manager=manager;
	this.name=name;
	 this.ceo=ceo;
}


void interactsWithCoustomers()
{
	System.out.println("company=interacts With Coustomers");
}
void handlesChallenges()
{
	System.out.println(" company=handle Challenges");
	
}

}
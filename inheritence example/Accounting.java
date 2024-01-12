public class Accounting
{
boolean isprocessing;
int noOfClient;

Accounting(boolean isprocessing,int noOfClient)
{
	this.isprocessing=isprocessing;
	this.noOfClient=noOfClient;
	
}

void calculateRevenue()
{
	System.out.println("Accounting=calculate Revenue");
}
void aquireNewClient()
{
	System.out.println(" accounting=aquire NewClient");
	
}
}
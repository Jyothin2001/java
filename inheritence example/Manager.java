public class Manager
{
int employeeCount;
boolean isBusy;

Manager(int employeeCount,boolean isBusy)
{
	this.employeeCount=employeeCount;
	this.isBusy=isBusy;
}


void conductMeeting()
{
	System.out.println("manager= conduct Meeting");
}
void finishMeeting()
{
	System.out.println(" manager=finish Meeting");
	
}
}
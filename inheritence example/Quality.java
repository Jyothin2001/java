public class Quality
{
boolean isefficiency;
boolean isAccurate;

Quality(boolean isefficiency,boolean isAccurate)
{
	this.isefficiency=isefficiency;
	this.isAccurate=isAccurate;
}


void ensureEfficiency()
{
	System.out.println("quality=ensure Efficiency");
}
void maintainAccuracy()
{
	System.out.println(" quality=maintainAccuracy");
	
}
}
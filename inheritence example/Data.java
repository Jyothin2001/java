public class Data
{
int dataSize;
boolean isProcessed;

Data(int dataSize,boolean isProcessed)
{
this.dataSize=dataSize;
this.isProcessed=isProcessed;
}

void setVlaue()
{
	System.out.println("data=set Value");
}
void process()
{
	System.out.println(" data=process");
	
}
}
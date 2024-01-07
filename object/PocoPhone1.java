public class PocoPhone1
{
static  String brandName;
static String madeIn;
static String os;

float screenSize; 
int yom;
String colour;
int cost;

PocoPhone1(float screenSize,int yom,String colour,int cost)
{
	this.screenSize=screenSize;
	this.yom=yom;
	this.colour=colour;
	this.cost=cost;
}

 void show1()
{
	System.out.println("screenSize :"+screenSize);
	System.out.println("yom :"+yom);
	System.out.println("colour :"+colour);
	System.out.println("cost :"+cost);
	
}


static
{
brandName="POCO";
madeIn="china";
os=" Android";

}

static void show()
{
	System.out.println("brandName :"+brandName);
	System.out.println("madeIn :"+madeIn);
	System.out.println("os :"+os);
	
}

void communication()
{
	System.out.println("phone make the mode of communication easier. ");
}

void money()
{
	System.out.println("earn money via mobile");
}

void education()
{
	System.out.println("to watch interactive lectures for practical learning ");
}

}
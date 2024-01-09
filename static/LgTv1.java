public class LgTv1
{
int screensize;
boolean isSmartTv;
int price ;

LgTv1(int screensize,boolean isSmartTv,int price)
{
	 this.screensize=screensize;
	 this.isSmartTv=isSmartTv;
	 this.price=price;
	 
 }

static
{
 String brandName="LG";
 String madeIn="South korea";
}

void display5()
{
	System.out.println("screensize: "+screensize);
	System.out.println("isSmartTv: "+isSmartTv);
	System.out.println("price: "+price);
	
}

static void display6()
{
    System.out.println("brandname: "+brandname);
	System.out.println("price: "+price);
	System.out.println("model: "+dimension);
}
static void news()
{
	System.out.println("provide news");
}
static void entertainment()
{
	System.out.println("gives entertainment");
}
static void information()
{
	System.out.println("we get information of world ");
}
}
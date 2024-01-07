public class Calculator1
{
float weight;
String type;
String display;
String brandname;
int price;
float dimension;

Calculator1(float weight,String type,String display,String brandname,int price,float dimension)
{
	this.weight=weight;
	this.type=type;
	this.display=display;
	this.brandname=brandname;
	this.price=price;
	this.dimension=dimension;
	
}
 void display()
{
	System.out.println("calculator weight: "+weight);
	System.out.println("type: "+type);
	System.out.println("display: "+display);
	System.out.println("brandname: "+brandname);
	System.out.println("price: "+price);
	System.out.println("model: "+dimension);
}


   // static method 
    static void add()
   {
   
   System.out.println("addition ");
   
   }
    static void multi()
   {
   
   System.out.println("multiplication ");
   
   }
    static void division()
   {
     System.out.println("division ");
   
   }
}
   
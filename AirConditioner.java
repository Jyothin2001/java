public class AirConditioner
{
   String brand;
   int powerConsuption;
   String colour;
   int price;
   boolean isItDualClimate;
   byte warranty;
   
   
   AirConditioner(String brand,int powerConsuption,String colour,int price,boolean isItDualClimate,byte warranty)
   {
	   
	   this(brand,powerConsuption,colour ,price,isItDualClimate);
	   this.warranty= warranty;
	   System.out.println("6 param");
   }
   
   AirConditioner(String brand,int powerConsuption,String colour,int price,boolean isItDualClimate)
   {
      this(brand,powerConsuption,colour ,price );
	  this.isItDualClimate= isItDualClimate;
	  System.out.println("5 param");
	  
   }
   
    AirConditioner(String brand,int powerConsuption,String colour,int price)
   {
	this(brand,powerConsuption,colour);
     this.price= price;
	 System.out.println("4 param");
      	 
   }
   
    AirConditioner(String brand,int powerConsuption,String colour)
   {
	  this(brand,powerConsuption);
	  System.out.println("3 param");
	  this.colour= colour;
   }
   
    AirConditioner(String brand,int powerConsuption)
   {
	   this(brand);
	   this.powerConsuption= powerConsuption;
	   System.out.println("2 param");
   }
   
    AirConditioner(String brand)
   {
	   this();
	   System.out.println("1 param");
	   
	  this.brand= brand;
	   
   }
    AirConditioner()
   {
	   System.out.println("0_____________________________________________ ");
   }
   
   
   public void Details()
   {
	   System.out.println(" Brand Name: "+ brand);
	   System.out.println(" powerConsuption: " +powerConsuption);
	   System.out.println(" colour: "+colour);
	   System.out.println(" price: "+price);
	   System.out.println(" is It Dual Climate: "+isItDualClimate);
	   System.out.println(" Warranty: "+warranty);
	   
   }
   
   public static void main(String[] args)
   {
	   
	   AirConditioner obj1= new AirConditioner("Hitachi",1540,"white",36990,true,(byte)2);
	   obj1.Details();
	   
	   AirConditioner obj2= new AirConditioner("Hitachi",1540,"white",36990,true);
	   obj2.Details();
	   
	   AirConditioner obj3= new AirConditioner("Hitachi",1540,"white",36990);
	   obj3.Details();
	   
	   AirConditioner obj4= new AirConditioner("Hitachi",1540,"white");
	   obj4.Details();
	   
	   AirConditioner obj5= new AirConditioner("Hitachi",1540);
	   obj5.Details();
	   
	   AirConditioner obj6= new AirConditioner(" Hitachi");
	   obj6.Details();
   }
}
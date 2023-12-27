public class AirConditioner          //  everything in java is associated with class and object along with the attributes and methods.
                                     // for example in real life a car is a real is an object and the car attributes such as weight, colour and method such as drive and brake
							         // a class is a object constructor or bluepribt for creating a object                              
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
	   System.out.println("**__________________________________________** ");
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

}
   
   
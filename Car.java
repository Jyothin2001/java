public class Car
{
	// intance variables/class level variables/global variables
	
	String brandName;
	String colour;
	int price;
	float mileage;
	boolean havingAc;
	byte airbags;
	short topSpeed;
	float engineCapacity;
	
	// parameterised constructor/ contructor with parameters
	Car(String brandName,String colour,int price,float mileage,boolean havingAc,byte airbags,short topSpeed,float engineCapacity)
	{
		this.brandName=brandName; 
		this.colour=colour;
		this.price=price;
		this.mileage=mileage;
		this.havingAc=havingAc;
		this.airbags=airbags;
		this.topSpeed=topSpeed;
		this.engineCapacity=engineCapacity;
		
		
	}
	
	public static void main(String [] args)
	{
		
		Car obj=new Car("Tata Nexon","Purple",1500000,20.08f,true,(byte)6,(short)180,1.2f); 		// passing arguments
	    System.out.println("Car Brands in India");
		System.out.println("___________________________");
		System.out.println("Name= "+obj.brandName);
		System.out.println("Colour= "+obj.colour);
        System.out.println("Price= "+obj.price);
        System.out.println("Mileage Kmpl= "+obj.mileage);
        System.out.println("Having AC= "+obj.havingAc);
 		System.out.println("Airbags= "+obj.airbags);
		System.out.println("Top Speed= "+obj.topSpeed);
		System.out.println("Engine Capacity= "+obj.engineCapacity);
		System.out.println("___________________________");
		
		byte value2=5;
		short value3=180;
		Car obj1=new Car("Maruti Brezza","blue",1600000,22.08f,true,value2,value3,1.4f); 		// passing arguments
		System.out.println("Name= "+obj1.brandName);
		System.out.println("Colour= "+obj1.colour);
        System.out.println("Price= "+obj1.price);
        System.out.println("Mileage Kmpl= "+obj1.mileage);
        System.out.println("Having AC= "+obj1.havingAc);
 		System.out.println("Airbags= "+obj1.airbags);
		System.out.println("Top Speed= "+obj1.topSpeed);
		System.out.println("Engine Capacity= "+obj1.engineCapacity);
		System.out.println("___________________________");
		
		
		Car obj2=new Car("Renault ","Black",2600000,20.08f,true,value2,value3,1.6f); 		// passing arguments
		System.out.println("Name= "+obj2.brandName);
		System.out.println("Colour= "+obj2.colour);
        System.out.println("Price= "+obj2.price);
        System.out.println("Mileage Kmpl= "+obj2.mileage);
        System.out.println("Having AC= "+obj2.havingAc);
 		System.out.println("Airbags= "+obj2.airbags);
		System.out.println("Top Speed= "+obj2.topSpeed);
		System.out.println("Engine Capacity= "+obj2.engineCapacity);
		System.out.println("___________________________");
		
		
		Car obj3=new Car("Skoda","White",2600000,22.08f,true,(byte)6,(short)170,2.7f); 		// passing arguments
		System.out.println("Name= "+obj3.brandName);
		System.out.println("Colour= "+obj3.colour);
        System.out.println("Price= "+obj3.price);
        System.out.println("Mileage Kmpl= "+obj3.mileage);
        System.out.println("Having AC= "+obj3.havingAc);
 		System.out.println("Airbags= "+obj3.airbags);
		System.out.println("Top Speed= "+obj3.topSpeed);
		System.out.println("Engine Capacity= "+obj3.engineCapacity);
		System.out.println("___________________________");
		
		
		Car obj4=new Car("Toyota","blue",1600000,22.08f,true,value2,value3,1.7f); 		// passing arguments
		System.out.println("Name= "+obj4.brandName);
		System.out.println("Colour= "+obj4.colour);
        System.out.println("Price= "+obj4.price);
        System.out.println("Mileage Kmpl= "+obj4.mileage);
        System.out.println("Having AC= "+obj4.havingAc);
 		System.out.println("Airbags= "+obj4.airbags);
		System.out.println("Top Speed= "+obj4.topSpeed);
		System.out.println("Engine Capacity= "+obj4.engineCapacity);
		System.out.println("___________________________");
		
		
	}
	
}
	
	
	
	


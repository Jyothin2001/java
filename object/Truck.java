public class Truck
{
 String driverSeat;
 String cabintype;
 String fuelType;
 byte tireNUmber;
 int fuelTank;
 byte passengers;
 
 Truck(String driverSeat,String cabintype,String fuelType,byte tireNUmber,int fuelTank,byte passengers)
 {
	 this.driverSeat=driverSeat;
	 this.cabintype=cabintype;
	 this.fuelType=fuelType;
	 this.tireNUmber=tireNUmber;
	 this.fuelTank=fuelTank;
	 this.passengers=passengers;
 }
 
 public void display8() //Method
{

System.out.println("--------------------------------------------------------------------------------------");
System.out.println("driverSeat: "+this.driverSeat);
System.out.println("cabintype: "+this.cabintype);
System.out.println("fuelType: "+this.fuelType);
System.out.println("tireNUmber: "+this.tireNUmber);
System.out.println("fuelTank "+this.fuelTank);
System.out.println("passengers: "+this.passengers);

}

 
 
 void delivery()
 {
	 System.out.println("faster delivery");
 }

void service()
 {
	 System.out.println("provides door to door services");
 }

void loads()
 {
	 System.out.println("carry multiple loads securely worldwide");
 }




}

public class AirConditioners
{
   
   public static void main(String[] args)
   {
	   
	   AirConditioner obj1= new AirConditioner("Hitachi",1540,"white",36990,true,(byte)2); // obeject is instance of class
	   obj1.Details();
	   
	   AirConditioner obj2= new AirConditioner("Hitachi",1540,"white",36990,true);
	   obj2.Details();
	   
	   AirConditioner obj3= new AirConditioner("Hitachi",1540,"white",36990);
	   obj3.Details();
	   
	   AirConditioner obj4= new AirConditioner("Hitachi",1540,"white");
	   obj4.Details();
	   
	   AirConditioner obj5= new AirConditioner("sony",1540);
	   obj5.Details();
	   
	   AirConditioner obj6= new AirConditioner(" Hitachi");
	   obj6.Details();
   }
}
class Camera
{
String brandName;
int price;
long resolution;
int modelYear;
DisplayType display;
ChargingType charging;
BatteryType  battery;
CameraType cameraa;


Camera()
{
	System.out.println("no parameter");
	
}

Camera(String brandName,int price,long resolution,int modelYear,DisplayType display,ChargingType charging,BatteryType  battery,CameraType cameraa)
{
	this.brandName=brandName;
	this.price=price;
	this.resolution=resolution;
	this.modelYear=modelYear;
	this.display=display;
	this.charging=charging;
	this.battery=battery;
	this.cameraa=cameraa;
	
	
}

public void Details()
{
	 System.out.println("camera BrandName :"+brandName);
	 System.out.println("camera price :"+price);
	 System.out.println("camera type :"+resolution);
	 System.out.println("camera model Year :"+modelYear);
	 System.out.println("camera display Type :"+display);
	 System.out.println("camera charging Type :"+charging);
	 System.out.println("camera battery Type :"+battery);
	 System.out.println("camera camera type :"+cameraa);
	 System.out.println("camera features :" );
 
}
}
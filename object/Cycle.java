public class Cycle
{
String bikeType;
String frameMaterial;
float frameSize;
String department;
String rims;
String brakes;

Cycle(String bikeType,String frameMaterial,float frameSize,String department,String rims,String brakes)
{
 this.bikeType=bikeType;
 this.frameMaterial=frameMaterial;
 this.frameSize=frameSize;
 this.department=department;
 this.rims=rims;
 this.brakes=brakes;
}

void display3()
{
	System.out.println("bikeType: "+bikeType);
	System.out.println("frame Material: "+frameMaterial);
	System.out.println("frameSize: "+frameSize);
	System.out.println("department: "+department);
	System.out.println("rims: "+rims);
	System.out.println("brakes: "+brakes);
}

void mobility()
{
	System.out.println(" improved joint mobility");
}

void Strength()
{
	System.out.println(" strengthened bones");
}

void fat()
{
	System.out.println(" decrease the body fat levels");
}

}

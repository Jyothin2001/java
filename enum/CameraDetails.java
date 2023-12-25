public class CameraDetails
{
public static void main(String[] args)
{
    Camera cam=new Camera();
	System.out.println("----------------------------------------------------------------------------------------------------------------");
	
   String[] features ={"Aperture","Resolution","Shutter Speed","Image Stabilization","RAW Format","HDR"};
   
   Camera camera = new Camera("Canon",50000,2184,2009,DisplayType.OLED,ChargingType.TYPEA,BatteryType.LITHIUMBATTERIES,CameraType.FILMCAMERA);
   camera.Details();
   for(int i=0;i<features.length;i++)
   {
	 System.out.println(features[i]);
   }
   
   System.out.println("----------------------------------------------------------------------------------------------------------------");
   Camera camera1 = new Camera("Nikon",60000,5167,2010,DisplayType.HYBRIDVIEWFINDER,ChargingType.TYPEF,BatteryType.LITHIUMIONBATTERIES,CameraType.COMPACTDIGITAL);
   camera1.Details();
   for(int i=0;i<features.length;i++)
   {
	   System.out.println(features[i]);
   }
   
   
   System.out.println("-----------------------------------------------------------------------------------------------------------------");
   Camera camera2 = new Camera("Sony",55000,3456,2018,DisplayType.AMOLED,ChargingType.TYPEE,BatteryType.ALKALINEBATTERIES,CameraType.DIGITALSLRCAMERA);
   camera2.Details();
   for(int i=0;i<features.length;i++)
   {
	   System.out.println(features[i]);
   }
   
   
   System.out.println("-----------------------------------------------------------------------------------------------------------------");
   Camera camera3 = new Camera("Panasonic",45000,2312,2008,DisplayType.TFT,ChargingType.TYPEB,BatteryType.NICDBATTERIES,CameraType.MIRROLESSCAMERA);
   camera3.Details();
   for(int i=0;i<features.length;i++)
   {
	   System.out.println(features[i]);
   }
   
   
   System.out.println("-----------------------------------------------------------------------------------------------------------------");
   Camera camera4 = new Camera("Fujifilm",70000,5134,2015,DisplayType.EVF,ChargingType.TYPEC,BatteryType.SALTBASEDBATTERIES,CameraType.ALLROUNDERCAMERA);
   camera4.Details();
   for(int i=0;i<features.length;i++)
   {
	   System.out.println(features[i]);
   }
   
   
   System.out.println("------------------------------------------------------------------------------------------------------------------");
   Camera camera5 = new Camera("Olympus",66000,6897,2019,DisplayType.OLED,ChargingType.TYPEA,BatteryType.NIMHBATTERIES,CameraType.ACTIONCAMERA);
   camera5.Details();
   for(int i=0;i<features.length;i++)
   {
	   System.out.println(features[i]);
   }
   
   
  
     switch(camera1.cameraa)
    {
	  case MIRROLESSCAMERA:
	  {
	     System.out.println("camera type is MIRROR_LESS_CAMERA");
	  }
		 break;
    
	  case DIGITALSLRCAMERA:
	  {
	    System.out.println("camera type is DIGITAL_CAMERA");
	  }
		break;
		
	  case FILMCAMERA:
	  {
	    System.out.println("camera type is FILM_CAMERA");
	  }
		break;
		
	 	
	  case ALLROUNDERCAMERA:
	  {
	    System.out.println("camera type is ALLROUNDER_CAMERA");
	  }
		break;
		
	 case ACTIONCAMERA:
	 {
	    System.out.println("camera type is ACTION_CAMERA");
	 }
	    break;
	 case COMPACTDIGITAL:
	  {
	    System.out.println("camera type is COMPACT_DIGITAL");
	  }
		break;
		
		default:	
	  {
	    System.out.println("None");
	  }
		
		
    }
}

}




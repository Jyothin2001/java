public class Plant
{
	static String plantName;
	float phValue;
	int height;
	
   Plant()
   { 
        this("Snake Plant");
	   System.out.println(" No parameter constructor");
	   
   }
   
   Plant(String plantName)
   {
	   this(5.5f);
	    System.out.println(" Snack plant");
	   
   }
   Plant(float phValue)
   {
	   this(1);
	    System.out.println(" Fast Draining And Slightly acidic With a PhD between 5.5 to 7.5 Potting soil  ");
	   
   }
   Plant(int height)
   {
	   
	    System.out.println(" Height of the snake plant 1 to 3 feet");
	   
   }
   



public static void main(String [] args)
{
  Plant obj=new Plant();

}
}

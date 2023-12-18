public class Jupiter
{
	
 Jupiter()
{
System.out.println(" Jupiter=No Parametrs");
}	

Jupiter(float num)
{
	System.out.println("changing the type of parameter " +num);
}

Jupiter(long num,long num1,long num3)
{
	System.out.println("changing the number of parameter");
}

Jupiter(float num2,short num8)
{
	System.out.println("changing the order of parameter");
}

public static void main(String [] args)
{
  new Jupiter(); //NO Argument is passing
  new Jupiter(2345.876f); // one argument is passing
  new Jupiter(23456654,76545,764); // more than one argument is passing
  short value12=4578;
  new Jupiter(76545.43f,value12); // more than one different argument is passing
  
 
}

}


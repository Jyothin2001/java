public class Time
{
	
 Time()
{
System.out.println(" LinkedIn=No Parametrs");
}	

Time(double num)
{
	System.out.println("changing the type of parameter " +num);
}

Time(char num,char num1)
{
	System.out.println("changing the number of parameter");
}

Time(boolean num2,int num8,char num9)
{
	System.out.println("changing the order of parameter");
}

public static void main(String [] args)
{
  new Time(); //NO Argument is passing
  new Time(7654.87654d); // one argument is passing
  new Time('d','g'); // more than one argument is passing
  new Time(false,76545,'j'); // more than one different argument is passing
  
 
}

}


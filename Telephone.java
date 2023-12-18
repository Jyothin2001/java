public class Telephone
{
	
 Telephone()
{
System.out.println(" LinkedIn=No Parametrs");
}	

Telephone(boolean num)
{
	System.out.println("changing the type of parameter " +num);
}

Telephone(long num,long num1)
{
	System.out.println("changing the number of parameter");
}

Telephone(float num2,int num8)
{
	System.out.println("changing the order of parameter");
}

public static void main(String [] args)
{
  new Telephone(); //NO Argument is passing
  new Telephone(true); // one argument is passing
  new Telephone(8765l,9876543l); // more than one argument is passing
  new Telephone(76545.43f,12); // more than one different argument is passing
  
 
}

}


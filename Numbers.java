public class Numbers
{
	
 Numbers()
{
System.out.println(" No Parametrs");
}	

Numbers(int num)
{
	System.out.println("changing the type of parameter");
}

Numbers(int num,int num1,int num3)
{
	System.out.println("changing the number of parameter");
}

Numbers(int numm,float num2,short num8)
{
	System.out.println("changing the order of parameter");
}

public static void main(String [] args)
{
  new Numbers(); //NO Argument is passing
  new Numbers(23456654); // one argument is passing
  new Numbers(23456654,76545,764); // more than one argument is passing
  short value12=4568;
  new Numbers(7656,76545.43f,value12); // more than one different argument is passing
  
 
}

}


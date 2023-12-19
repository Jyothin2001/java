 
 
 
 public class Watch
{
public static void main(String [] args)
{
  new Jupiter(); //NO Argument is passing
  new Jupiter(2345.876f); // one argument is passing
  new Jupiter(23456654,76545,764); // more than one argument is passing
  short value12=4578;
  new Jupiter(76545.43f,value12); // more than one different argument is passing
  System.out.println("___________________________");
  
  
  new LinkedIn(); //NO Argument is passing
  new LinkedIn('k'); // one argument is passing
  byte one=23;
  byte two=127;
  new LinkedIn(one,two); // more than one argument is passing
  short value15=4578;
  new LinkedIn(76545.43f,value12); // more than one different argument is passing
  System.out.println("___________________________");
  
 new Telephone(); //NO Argument is passing
  new Telephone(true); // one argument is passing
  new Telephone(8765l,9876543l); // more than one argument is passing
  new Telephone(76545.43f,12); // more than one different argument is passing
  System.out.println("___________________________");
  
  new Time(); //NO Argument is passing
  new Time(7654.87654d); // one argument is passing
  new Time('d','g'); // more than one argument is passing
  new Time(false,76545,'j'); // more than one different argument is passing
  System.out.println("___________________________");
  
  new Numbers(); //NO Argument is passing
  new Numbers(23456654); // one argument is passing
  new Numbers(23456654,76545,764); // more than one argument is passing
  short value16=4568;
  new Numbers(7656,76545.43f,value12); // more than one different argument is passing
  
}

}
 
 class Jupiter

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
}
// 2

 class LinkedIn
{
	
 LinkedIn()
{
System.out.println(" LinkedIn=No Parametrs");
}	

LinkedIn(char num)
{
	System.out.println("changing the type of parameter " +num);
}

LinkedIn(byte num,byte num1)
{
	System.out.println("changing the number of parameter");
}

LinkedIn(float num2,short num8)
{
	System.out.println("changing the order of parameter");
}
}
//3
 class Telephone
{
	
 Telephone()
{
System.out.println(" Telephone=No Parametrs");
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
}

//4
 
 class Time
{
	
 Time()
{
System.out.println(" Time=No Parametrs");
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
}

//5

 class Numbers
{
	
 Numbers()
{
System.out.println(" Numbers=No Parametrs");
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
}





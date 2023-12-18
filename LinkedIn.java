public class LinkedIn
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

public static void main(String [] args)
{
  new LinkedIn(); //NO Argument is passing
  new LinkedIn('k'); // one argument is passing
  byte one=23;
  byte two=127;
  new LinkedIn(one,two); // more than one argument is passing
  short value12=4578;
  new LinkedIn(76545.43f,value12); // more than one different argument is passing
  
 
}

}


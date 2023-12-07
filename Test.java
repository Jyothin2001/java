public class Test
{
 public static void main(String[] args)
 {
	byte returnValue=multiplication();
	System.out.println(returnValue);
	
	short returnDiv=division();
	System.out.println(returnDiv);
	
	int returnAd=add();
	System.out.println(returnAd);
	
	
	float returnAdd=addition();
	System.out.println(returnAdd);
	
	double returnMin=minus();
	System.out.println(returnMin);
	
	long value=min();
	System.out.println(value);
	
	char first=initial();
	System.out.println(first);
	
	boolean second=check();
	System.out.println(second);

 }
    static byte multiplication()
    {
	  byte value=127;
	  return value;
    }
	static short division()
	{
		
		short value=3209;
		return value;
	}

 	
	static int add()
    {
	  int number1=10000;
	  int number2=11600;
	  int value=number1+number2;
	  return value;
    }
	
	static float addition()
	{
		float num1=19.34f;
		float num2=20.4f;
		float value=num1+num2;
		return value;
	}	
	static double minus()
	{
		double num1=2.99792458d;
		double num2=6.283185307d;
		double value=num1-num2;
		return value;
	}
	static long min()
	{
		long num=7846912351l;
		long num1=4791265972l;
		long value =num-num1;
		return value;
	}
	static char initial()
	{
		char ram='a';
		return ram;
	}
	
	static boolean check()
	{
		boolean value=true;
		return value;
	}
	
}


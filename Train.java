public class Train
{
public static void main(String [] args)
{
	sum(10);
	sum(23.87f);
	sum('a');
	short value=32178;
	sum(value);
	byte values=127;
	sum(values);
	
	byte number=32;
	div(number);
	div(23.5f,21.4f,6543.43221f);
	div(12345,5422,567,87654);
	
	short output=99;
	multi(1234,456.65f,'s',output);
	short num=100;
	multi(876.988f,'j',7653246,num);
	short num1=124;
	multi(num1,'k',23.2f,87649765);
}
//1st way=changing the type of parameters(method overloading)

static void sum(int value)
{
	System.out.println("changing the type of parameter " + value);
}
static void sum(float value)
{
	System.out.println("changing the type of parameter " + value);
}
static void sum(char value)
{
	System.out.println("changing the type of parameter " + value);
}
static void sum(short value)
{
	System.out.println("changing the type of parameter " + value);
}
static void sum(byte value)
{
	System.out.println("changing the type of parameter " + value);
}



//2nd way=number of parameters

static void div(byte value)
{
	System.out.println("changing the number of parameter " );
}

static void div(float value, float value1,float value2)
{
	float output=value+value1+value2;
	System.out.println("changing the number of parameter " + output);
}
static void div(int value,int num,int num1,int num2)
{
	int output=value+num+num1+num2;
	System.out.println("changing the number of parameters " + output);
}


//3rd way=changing the order of parameter

static void multi(int num,float num2,char num3,short num4)
{
	System.out.println("changing the order of parameters " );
}

static void multi(float num,char num2,int num3,short num4)
{
	System.out.println("changing the order of parameters ");
}

static void multi(short num,char num2,float num3,int num4)
{
	System.out.println("changing the order of parameters " );
}

}
public class Casting
{
public static void main(String[] args)
{
// up casting(explicit type or wildning)= compiler converts lower datatype value into higher datatype value

byte number=34;
short value=number;
System.out.println(value);

short num=32000;
int value1=num;
System.out.println(value1);

int num1=654272927;
long value2=num1;
System.out.println(value2);

float num3=27544.76459f;
double value3=num3;
System.out.println(value3);

char num4='j';
int value4=num4;
System.out.println(value4);  // it shows output as ASCII value of small letter j=106


// down  casting(implicit type or norrow type)= converts higher datatype value into lower datatype value ,here the problem is we lost some data  

long num5=65423560987l;
int value5=(int) num5;
System.out.println(value5);

int num6=6542357;
short value6=(short) num6;
System.out.println(value6);

short num7=32689;
byte value7=(byte) num7;
System.out.println(value7);

double num8=5776.8765765d;
float value8=(float) num8;
System.out.println(value8);

int num9=106;
char value9=(char) num9;
System.out.println(value9);


// lowercase to uppercase covertion in java

char num10='l';
int value10=num10 -32;
char upper=(char) value10;
System.out.println(upper);


char num11='L';
int value11=num11 + 32;
char lower=(char) value11;
System.out.println(lower);





 






}
}
public class Bike
{

public static void main(String[] args)
{
// array is the collection of homogenous/similar values 

byte byteArray[]={(byte)19,(byte)123,(byte)31,(byte)22,(byte)33,(byte)67,(byte)86,(byte)44,(byte)89,(byte)128,(byte)23,(byte)11,(byte)87,(byte)54,(byte)77,(byte)65,(byte)49,(byte)78,(byte)89,(byte)43};
  
  for(int i=0; i<20; i++)
  System.out.println( "byte = " + byteArray[i] );

short shortArray[]={(short)199,(short)12398,(short)32732,(short)2276,(short)3343,(short)687,(short)865,(short)4490,(short)19543,(short)18927,(short)2333,(short)1871,(short)84327,(short)5754,(short)7117,(short)6125,(short)4449,(short)7998,(short)8129,(short)4613};
  
  for(int i=0; i<20; i++)
  System.out.println( "short = " + shortArray[i] );
  System.out.println(shortArray[3]);

int intArray[]={1986,15423,31,22,3443,67,86,44,89,272111364,23,11,87,54,77,65,49,78,89,43};
  
  for(int i=0; i<20; i++)
  System.out.println( "int = " + intArray[i] );

char charArray[]={'d','s','s','a','t','e','t','l','z','x','v','m','n','b','l','j','g','f','o','p'};

    for(int i=0;i<20;i++)
	System.out.println("char = " +charArray[i]);
    System.out.println(charArray[15]);

long[] longArray = {123456765432l,786956438907l,345676541234l,678907653456l,124567890987l,123465765980l,456790876543l,564378659087l,789065436789l,654789076543l,234567890987l,658967889087l,890765431234l,567890876543l,345678906432l,123452671234l,567843218907l,908756781234l,786565433456l,980765437890l};
            for (int index=0; index<20; index++)
			{
			System.out.println("long = " +charArray[index]);
			}
			System.out.println(charArray[14]);
		    
		
float[] cgpa = { 5.9f,7.8f,6.9f,8.0f,5.9f,8.7f,8.6f,6.9f,7.0f,8.0f,5.8f,7.9f,6.9f,6.0f,7.5f,7.0f,4.9f,4.8f,7.5f,7.9f};
            for (int m=0; m<20; m++){
			System.out.println("float = " +cgpa[m]);
		}
		
double[] doubleArr = {9.567843d,4.5432134d,12.3456321d,3.56784d,23.456432d,5.5679084d,45.4567890d,3.4567432d,67.54327d,78.234456789d,23.12345679d,24.345678d,34.4567890d,21.344566d,36.45676543d,28.45678d,38.890754d,45.678654d,45.8765678d,89.765432d};
for (int a=0; a<20; a++){
			
System.out.println("double = " +doubleArr[a]);
		}
		
boolean[] booleanArray = {true,false,true,false,false,false,true,true,true,true,false,true,true,true,false,false,false,true,true,false};
for (int p=0; p<20; p++){
System.out.println("boolean = "  +booleanArray[p]);
		}
		



}
}
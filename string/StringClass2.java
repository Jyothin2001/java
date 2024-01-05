public class StringClass2
{
public static void main(String [] args)
{
String str="hello world";
 char[] chararr = str.toCharArray(); //convert string to char using string_method
 System.out.println(chararr);
 
 for(int i=chararr.length-1 ; i>0; i--)
 {
	 System.out.print(chararr[i]);
 }
 
 
  
}
}


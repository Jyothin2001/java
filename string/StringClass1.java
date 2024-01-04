public class StringClass1
{
public static void main(String [] args)
{
//String name="";
//System.out.println(name.isEmpty());


//empty string value
String name1 ="jyothi";  
boolean value = name1.isEmpty();
System.out.println(value);

// leading and trailing white space removed
String s1=" string contain white space  ";  
 int val=s1.length();
 
 String value1= s1.trim();
 int val1=value1.length();
System.out.println("without trim ,the length is: "+val + " , after trim length is: "+val1 + " "+value1);

// value of (static)

boolean s2 =true;
String value3 =String.valueOf(s2);
System.out.println(value3);
  
 int s3= 12;
 System.out.println(String.valueOf(s3));
 
 long s4= 23456712l;
 System.out.println(String.valueOf(s4));
 
 float s5= 212.8765f;
 System.out.println(String.valueOf(s5));
 
 double s6= 1276.34567d;
 System.out.println(String.valueOf(s6));
 
 char s7= 'a';
 System.out.println(String.valueOf(s7));
 
 char[] s8= {'j','a','v','a'};
 System.out.println(String.valueOf(s8));
 
 char[] s9={'j','a','v','a'};
 System.out.println(String.valueOf(s9,1,3)); //from (index) and how many
 
 //char[] s9=new name4 {'j','k','l','m'};
 //System.out.println(String.valueOf(s9,1,3)); 
 
 // sub string
  String s10 = "unhappy";
  System.out.println(s10.substring(2)); 
  
  String s11 = "happy";
  System.out.println(s11.substring(2,5)); //5-1=4
  
  //replace 
  
  String s12= "eemile";
  System.out.println(s12.replaceFirst("ee","s")); 
  
  // ignore case 
  
  String s13="java";
  String s14="JAVA";
  String s15="script";
  boolean s16=s13.equalsIgnoreCase(s14);
  System.out.println(s16);
  
  System.out.println(s14.equalsIgnoreCase(s15));
  
  // ends and start with
  
  String s17 = "Welcome to Javascript";  
  System.out.println(s17.endsWith("point"));  // false
  System.out.println(s17.endsWith("t")); //true
  boolean s18=s17.endsWith("script"); //true
 System.out.println(s18);   
 
String s19="java string ,java script";    
System.out.println(s19.startsWith("ja"));  // true  
System.out.println(s19.startsWith("java string"));   // true  
System.out.println(s19.startsWith("Java string"));  // false as 'j' and 'J' are different

  // uppercase and lower case
  
  String s20="hello world";
  String s21="HELLO world";
  System.out.println(s20.toUpperCase() +"  "+s21.toLowerCase());
  
 }
}
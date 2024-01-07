public class Person
{
String name;
byte age;
String city;
String gender;
float weight;
float height;


Person(String name,byte age,String city,String gender,float weight,float height)
{
	this.name=name;
	this.age=age;
	this.city=city;
	this.gender=gender;
	this.weight=weight;
	this.height=height;
	
}
void display7()
{
	System.out.println("name: "+name);
	System.out.println("age: "+age);
	System.out.println("city: "+city);
	System.out.println("gender: "+gender);
	System.out.println("weight: "+weight);
	System.out.println("height: "+height);
}

public void eat()
{
System.out.println("a person can eat");
	
}

public void walk()
{
System.out.println(" a person can walk");
	
}

public void play()
{
System.out.println(" a person can paly");
	
}

}

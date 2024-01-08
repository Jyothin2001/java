public class Dog
{
 String name;
 String breed;
 byte age;
 int height;
 int weight;
 int byteForce;
 
 Dog(String name,String breed,byte age,int height,int weight,int byteForce)
 {
	 
	 this.name=name;
	 this.breed=breed;
	 this.age=age;
	 this.height=height;
	 this.weight=weight;
	 this.byteForce=byteForce;
	
	 
 }
 
 public void display10() //Method
{
System.out.println("name: "+this.name);
System.out.println("breed: "+this.breed);
System.out.println("age: "+this.age);
System.out.println("height: "+this.height);
System.out.println("weight "+this.weight);
System.out.println("byteForce: "+this.byteForce);

}
 
 void protection()
 {
	 System.out.println("protection");
 }

void hunting()
 {
	 System.out.println("hunting");
 }

void military()
 {
	 System.out.println("military");
 }

}
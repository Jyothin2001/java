public class Runner
{
public static void main(String[] args)
{
Calculator1 calsi = new Calculator1(0.50f,"mini-printer","large","casio",1499,6.00f);
calsi.display();

Calculator1.add();
Calculator1.multi();
Calculator1.division();

System.out.println("--------------------");

College1 obj = new College1("GFGC",20000,20,"BCU",1980,1);
obj.display1();

obj.development();
obj.opportunities();
obj.connection();

System.out.println("--------------------");

Cycle obj1 = new Cycle("Mountain Bike","Steel",17.5f,"unisex","Double Wall","Disc");
obj1.display3();

obj1.Strength();
obj1.fat();
obj1.mobility();

System.out.println("--------------------");

LgTv1 tv = new LgTv1(32,true,34566);
tv.display5();
LgTv1.display6();

LgTv1.entertainment();
LgTv1.information();
LgTv1.news();


System.out.println("--------------------");

PocoPhone1 phone = new PocoPhone1(6.67f,2022,"blue",12389);
phone.show1();
PocoPhone1.show();

phone.communication();
phone.education();
phone.money();



System.out.println("--------------------");

Person person= new Person("Ram",(byte)24,"krp","male",50.5f,5.5f);
person.display7();
person.play();
person.walk();
person.eat();

System.out.println("--------------------");

}
}






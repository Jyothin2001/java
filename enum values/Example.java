public class Example
{

BloodGroups blood;
Gender gender;
Semester sem;
Payment payment;
Food food;
Ratings ratings;
Result result;
Grade grade;
Days  days;
TrafficLight light;

Example(BloodGroups blood,Gender gender,Semester sem,Payment payment,Food food,Ratings ratings,Result result,Grade grade,Days  days,TrafficLight light)
{
      this.blood=blood;
	  this.gender=gender;
	  this.sem=sem;
	  this.payment=payment;
	  this.food=food;
	  this.ratings=ratings;
	  this.result=result;
	  this.grade=grade;
	  this.days=days;
	  this.light=light;
}

 void Display()
{
	System.out.println("Blood Group is: "+blood);
	System.out.println("Gender: "+gender);
	System.out.println("Semester: "+sem);
	System.out.println("payment Mode: "+payment);
	System.out.println("Food Type: "+food);
	System.out.println(ratings+" :Star");
	System.out.println("Result: "+result);
	System.out.println("Grade: "+grade);
	System.out.println(days+" : Day ");
	System.out.println("Traffic Light is: "+light);
}
}
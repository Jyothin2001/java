public class ExampleStarter
{
public static void main(String[] args)
{
        Example obj=new Example(BloodGroups.A_POSITIVE,Gender.MALE,Semester.FIRST,Payment.ONLINE,Food.VEG,Ratings.TWO,Result.PASS,Grade.A,Days.WEDNESDAY,TrafficLight.GREEN);
        obj.Display();
        System.out.println("--------------------------------------------------");
		System.out.println("         ***Inside values***");
        System.out.println(obj.blood.value);// object.enum reference(variable name).enum int value
		System.out.println(obj.gender.value); 
		System.out.println(obj.sem.value);
		System.out.println(obj.payment.value);
		System.out.println(obj.food.value);
		System.out.println(obj.ratings.value);
		System.out.println(obj.result.value);
		System.out.println(obj.grade.value);
		System.out.println(obj.days.value);
		System.out.println(obj.light.value);
		
		BloodGroups ab = BloodGroups.A_POSITIVE; //way=store enum.its value to a variable
	    System.out.println(ab);
		
	    Semester abc = Semester.FIRST;
	    System.out.println(abc); 
       
	   System.out.println("--------------------------------------------------");
	   System.out.println("      ***condition/operations using enum****");
	   
	   if(abc.value > 0)            ////way1=store enum.its value to a variable then add .value to compare
	   {
		   System.out.println("one is greater than 1 ");
		}
		else
		{
			System.out.println("one is lesser than 1");
		}
		   
		
		if(obj.ratings.value==2) // way2=direct give .value to compare
		{
			System.out.println("the Given Rating value is 2 equals to 2");
		}
		else
		{
			System.out.println("the Given Rating value is 2  not equals to 2");
		}
		
		if(obj.food.value=="VEG")    //way2=direct give .value to compare
		{
			System.out.println("yes! it is veg");
		}
		else
		{
			System.out.println("no! it is not veg");
		}
       if(ab.value == "A+ve")            ////way1=store enum.its value to a variable then add .value to compare
	   {
		   System.out.println("yes ");
		}
		else
		{
			System.out.println("no");
		}
  
}
}


public class Laptop
{
public static void main(String[] args)
{
	add(32909999);
	multi(19.7854225f);
	div(1245.98873235873);
	name('M');
	fact(false);
}
static void add(int input)
    {
	  
	  System.out.println("the int value is " +input);
    }


static void multi(float input)
    {
	  
	  System.out.println("the float value is " +input);
    }
static void div(double input)
    {
	  
	  System.out.println("the double value is " +input);
    }
	static void name(char input)
	{
		System.out.println("Name is roopa "+input);
	}
static void fact(boolean input)
	{
		System.out.println("There is only one star in the sky : "+input);
	}

}
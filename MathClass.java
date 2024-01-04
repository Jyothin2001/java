
import java.lang.Math;
public class MathClass
{
public static void main(String[] args)
{
double a = Math.ceil(12.765);
System.out.println(a);

double b = Math.cbrt(27);
System.out.println(b);

int c = Math.subtractExact(765,95);
System.out.println(c);

long d = Math.subtractExact(754567887l,956543765l);
System.out.println(d);

double e = Math.nextAfter(765.456d,95.9876d);
System.out.println(e);

float f = Math.copySign(765.876f,-95.23f);
System.out.println(f);


}
}
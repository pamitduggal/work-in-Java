//role of super keyword in constructors
class base
{
base(double r)
{
 double circle=3.14*r*r;
 System.out.println("Area of circle is "+circle);
}
}
class derived extends base
{
derived(double r)
{ super(r);
  double square=r*r;
 System.out.println("Area of square is "+square);
}
}
class consoverridewithsuper
{
public static void main(String args[])
{
 derived obj=new derived(2.5);
}
}
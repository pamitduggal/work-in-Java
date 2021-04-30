class base
{
void area(double r)
{
 double circle=3.14*r*r;
 System.out.println("Area of circle is = "+circle);
}
}
class derived extends base
{
void area(double r)
{ 
 super.area(r);
 double square=r*r;
 System.out.println("Area of square is = "+square);
}
}
class overridewithsuper
{
public static void main(String args[])
{
 derived obj=new derived();
 obj.area(7.5);
}
}
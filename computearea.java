import areapkg.*;
class computearea
{
public static void main(String args[])
{
circlearea obj1=new circlearea();
double circlearea=obj1.area(3.5);
System.out.println("Area of Circle is =" +circlearea);
rectarea obj2=new rectarea();
double rectarea=obj2.area(3.5,4.5);
System.out.println("Area of Rectangle is =" +rectarea);
}
}


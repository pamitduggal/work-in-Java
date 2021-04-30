class demowrapping
{
public static void main(String args[])
{
 byte num=20;
 int marks=95;
 float price=25.5f;
 double rate=75.5;

Byte g1=new Byte(num);
Integer m1=new Integer(marks);
Float f1=new Float(price);
Double r1=new Double(rate);

System.out.println("Value of wrapper object(printing as objects)");
System.out.println("Byte object g1"+g1);
System.out.println("Integer object m1"+m1);
System.out.println("Float object f1"+f1);
System.out.println("Double object r1"+r1);

System.out.println();

byte b=g1.byteValue();
int i=m1.intValue();
float f=f1.floatValue();
double d=r1.doubleValue();

System.out.println("Unwraped values(printed as values");
System.out.println("byte value b"+b);
System.out.println("integer value i"+i);
System.out.println("Float value f"+f);
System.out.println("Double value d"+d);

}
}
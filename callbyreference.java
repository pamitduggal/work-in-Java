class demo
{
 int i;
 demo(int i)
 {
 this.i=i;
 }
 void inc(demo x)	//object as argument
 {
  x.i=x.i+3;
 }
}
class callbyreference
{
public static void main(String args[])
{
demo obj=new demo(20);
System.out.println("Before calling value of i is="+obj.i);
obj.inc(obj);
System.out.println("After calling value of i is="+obj.i);
}
}
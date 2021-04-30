class demo
{
 void inc(int x)
 {
  x=x+3;
 }
}
class callbyvalue
{
public static void main(String args[])
{
demo obj=new demo();
int i=20;
System.out.println("Before calling value of i is="+i);
obj.inc(i);
System.out.println("After calling value of i is="+i);
}
}
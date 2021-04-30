class base
{
int a,b;
void get1(int x,int y)
{
a=x;
b=y;
}
void add1()
{
System.out.println("sum of two numbers"+(a+b));
}
}

class derived extends base
{
int c;
void get2(int z)
{
c=z;
}
void add2()
{
System.out.println("sum of two numbers"+(a+b+c));
}
}
class inheritance
{
public static void main(String args[])
{
derived d=new derived();
d.get1(5,4);
d.add1();
d.get2(6);
d.add2();
}
}
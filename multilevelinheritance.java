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
System.out.println("sum of two numbers = "+(a+b));
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
System.out.println("sum of three numbers = "+(a+b+c));
}
}
class derived2 extends derived
{
int d;
void get3(int k)
{
d=k;
}
void add3()
{
System.out.println("sum of four numbers = "+(a+b+c+d));
}
}
class multilevelinheritance
{
public static void main(String args[])
{
derived2 d=new derived2();
d.get1(69,44);
d.add1();
d.get2(6);
d.add2();
d.get3(7);
d.add3();
}
}
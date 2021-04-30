class methodtypeover
{
 void sample(int x)
{
System.out.println(++x);
}
void sample(char y)
{
 System.out.println(++y);
}
public static void main(String args[])
{
 methodtypeover obj=new methodtypeover();
 obj.sample(10);
 obj.sample('A');
}
}

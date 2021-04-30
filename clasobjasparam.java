 //Using objects as parameters
class abc
{
int a,b;
void getvalue()
{
 a=10;
 b=20;
}
int sum(abc x)
{
return(x.a+x.b);
}
}
class clasobjasparam
{
 public static void main(String args[])
{
 abc obj=new abc();
 abc obj1=new abc();
 obj.getvalue();
 int result=obj1.sum(obj);
 System.out.println("Sum="+result);
}
}
 
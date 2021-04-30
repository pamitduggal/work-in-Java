class sample
{
final void display()
{ 
System.out.println("final method ");
}
}
class derived extends sample
{
void display1()
{
System.out.println("same method in derived class, will get compile time error");
}
}
class finalmethod
{
public static void main(String args[])
{
derived obj=new derived();
obj.display();
}
}
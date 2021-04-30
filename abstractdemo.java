abstract class sample
{
abstract void display();
}
class derived extends sample
{
void display()
{
System.out.println("Abstrat method in derived class");
}
}
class abstractdemo
{
public static void main(String args[])
{
derived obj=new derived();
obj.display();
}
}
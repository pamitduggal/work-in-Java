abstract class sample
{
  abstract void display();
}
class derived extends sample
{
void display()
 {
 System.out.println("Abstract Method in Derived class");
 }
}
class Abstract
{
public static void main(String args[])
 {
  derived obj=new derived();
  obj.display();
 }
}

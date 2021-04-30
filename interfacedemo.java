interface messageprint
{
void display();
}
class sample implements messageprint
{
public void display()
{
System.out.println("Implementing Interface");
}
}
class interfacedemo
{
public static void main(String args[])
{
sample obj=new sample();
obj.display();
}
}
interface first
{
void print();
}
interface second
{
void display();
}
class multipledemo implements first,second
{
public void print()
{
System.out.println("Multiple");
}
public void display()
{
System.out.println("Inheritance");
}
}
class multipleinheritance
{
public static void main(String args[])
{
multipledemo obj=new multipledemo();
obj.print();
obj.display();
}}
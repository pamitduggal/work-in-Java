import java.util.Scanner;
class student
{
int rollno;
String name;
Scanner s=new Scanner(System.in);
public void getdata1()
{
System.out.println("Enter rollno and name");
rollno=s.nextInt();
name=s.next();
}
public void display1()
{
System.out.println("Rollno="+rollno);
System.out.println("Name="+name);
}
}
class test extends student
{
int marks;
public void getdata2()
{
getdata1();
System.out.println("Enter marks");
marks=s.nextInt();
}
public void display2()
{
display1();
System.out.println("Marks="+marks);
}
}
class singleinheritance
{
public static void main(String args[])
{
test obj=new test();
obj.getdata2();
obj.display2();
}
}
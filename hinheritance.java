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
class age extends student
{
int age;
public void getdata3()
{
getdata1();
System.out.println("Enter age");
age=s.nextInt();
}
public void display3()
{
display1();
System.out.println("Age="+age);
}
}
class hinheritance
{
public static void main(String args[])
{
test obj=new test();
age obj1=new age();
obj.getdata2();
obj.display2();
obj1.getdata3();
obj1.display3();
}
}
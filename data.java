class teacher implements college 
{
int name,qual;
void getinfo();
void dispinfo();
}
class teacher extends department
{
int depno,depname;
public void getinfo()
{
System.out.println("Enter Name");
name=in.nextInt();
System.out.println("Enter Qualification");
qual=in.nextInt();
System.out.println("Enter Department No");
depno=in.nextInt();
System.out.println("Department Name");
depname=in.nextInt();
System.out.println("Enter College Name");
clgname=in.nextInt();
}
public void dispinfo()
{ 
System.out.println("Name"+name);
System.out.println("Qualification"+qual);
System.out.println("Department No"+depno);
System.out.println("Department Name"+depname);
System.out.println("College Name"+clgname);
}
}
interface college
{ 
int clgname=0;
}
class data
{
public static void main(String Args[])
{
data obj=new data();
obj.getinfo();
obj.dispinfo();
}
}

//default constructor
class defaultcons
{
 int rollno,marks;
 defaultcons()
 {
  rollno=1001;
  marks=80;
 }
void display()
{
 System.out.println("Roll No.="+rollno);
 System.out.println("Marks="+marks);
}

public static void main(String args[])
{
 defaultcons s=new defaultcons();
 s.display();
}}
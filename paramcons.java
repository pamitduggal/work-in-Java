class paramcons
{
 int rollno,marks;
 paramcons(int a,int b)	//parameterized constructor
 {
  rollno=a;
  marks=b;
 }
void display()
{
 System.out.println("Roll No.="+rollno);
 System.out.println("Marks="+marks);
}

public static void main(String args[])
{
 paramcons s=new paramcons(1002,75);
 s.display();
}}
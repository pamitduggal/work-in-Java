class staticparamethod
{
 int rollno,marks;
 static String college="Rochester Wing";
 staticparamethod(int a,int b)
 {
  rollno=a;
  marks=b;
 }
 static int cube(int x)
 {
  return x*x*x;
 }
void display()
{
 System.out.println("Roll No.="+rollno);
 System.out.println("Marks="+marks);
 System.out.println("College="+college);
}
public static void main(String args[])
{
 staticparamethod s1=new staticparamethod(1002,75);
 staticparamethod s2=new staticparamethod(1003,80);
 int result=staticparamethod.cube(6);	
 System.out.println("Cube of number="+result);
 s1.display();
 s2.display();
}}
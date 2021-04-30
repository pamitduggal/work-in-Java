class copycons
{
 int rollno,marks;
 copycons()	     //default constructor
 {
  rollno=100;
  marks=89;
 }
 copycons(copycons obj)    //copy constructor
 {
  rollno=obj.rollno;;
  marks=obj.marks;
 }
void display()
{
 System.out.println("Roll No.="+rollno);
 System.out.println("Marks="+marks);
}

public static void main(String args[])
{
 copycons s1=new copycons();
 copycons s2=new copycons(s1);
 s1.display();
 s2.display();
}}
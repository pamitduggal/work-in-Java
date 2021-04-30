class sinfo
{
int rollno;
String name;
String clas;
void display()
 {
 System.out.print("Student Information is:");
 System.out.println("\n Rollno\t"+rollno+"\nName\t"+name+"\nClass\t"+clas);
 }
}
class classes
{
 public static void main (String args[])
  {
    sinfo s=new sinfo();
    s.rollno=10;
    s.name="James";
    s.clas="bca";
    s.display();
   }
}

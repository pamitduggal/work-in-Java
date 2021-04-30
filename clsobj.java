class sinfo 
{
int rollno;
String name;
String classes;
void display() 
{
System.out.print("Student Information is: ");
System.out.println("\n Rollno\t"+rollno+"\n Name\t" +name+"\n class \t"+classes);
}
}
class clsobj
{
	public static void main(String args[]) 
	{
		sinfo s = new sinfo();
		s.rollno = 1440;
		s.name = "James";
		s.classes = "BCA";
		s.display();
	}
}

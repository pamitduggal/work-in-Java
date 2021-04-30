 class paracons
{
  int rollno;
  int marks;
  paracons(int x,int y)
  {
   rollno=x;
   marks=y;
  }
  void display()
  {
  System.out.println("Rollno-"+rollno);
  System.out.println("Marks-"+marks);
  }
  public static void main(String args[])
  {
  paracons obj=new paracons(1001,99);
  obj.display();  
  }
}

import java.util.Scanner;
class largest
{
 public static void main (String args[])
  {
    int x,y,z;
    System.out.println("Enter 3 Integers");
    Scanner in=new Scanner(System.in);
    x=in.nextInt();
    y=in.nextInt();
    z=in.nextInt();
    if(x>y && x>z)
    System.out.println(x +"First Number is Largest");
    else if(y>x && y>z)
    System.out.println(y +"Second Number is Largest");
    else if(z>x && z>y)
    System.out.println(z +"Third Number is Largest");
    else
    System.out.println("Entered Number are Distinct");
  }
}



     
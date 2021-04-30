class moverload
{
 void sum(int x,int y)
 {
  System.out.println("Sum="+(x+y));
 }
 void sum(double x,double y,double z)
 {
  System.out.println("Sum="+(x+y+z));
 }
 public static void main(String args[])
 {
  moverload obj=new moverload();
  obj.sum(15,20);
  obj.sum(10.56,15.49,20.02);
 }
}
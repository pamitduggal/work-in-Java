class bank
{
 int ROI()
  {
   return 0;
  }
}
class SBI extends bank
{
 int ROI()
  {
   return 8;
  }
}
class PNB extends bank
{
 int ROI()
  {
   return 9;
  }
}
class AXIS extends bank
{
 int ROI()
  {
   return 7;
  }
}
class Dynamicmethoddispatch
{
 public static void main(String args[])
{
bank obj1=new SBI();    //upcasting
bank obj2=new PNB();	//upcasting
bank obj3=new AXIS();	//upcasting
System.out.println("SBI Rate"+obj1.ROI()+"%");
System.out.println("PNB Rate"+obj2.ROI()+"%");
System.out.println("AXIS Rate"+obj3.ROI()+"%");
}
}

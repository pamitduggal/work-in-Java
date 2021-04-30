class MyThread1 extends Thread
{ 
int i;
public void run()
{
for(i=1;i<=4;i++)
System.out.println("From Thread1 i="+i);
}
}
class MyThread2 extends Thread
{
int j;
public void run()
{
for(j=1;j<=4;j++)
System.out.println("From Thread2 j"+j);
}
}
class  Tpriority
{
public static void main(String args[])
{
 MyThread1 t1=new MyThread1();
 MyThread2 t2=new MyThread2();
 t1.setPriority(Thread.MIN_PRIORITY);
 t2.setPriority(Thread.MAX_PRIORITY);
 t1.start();
 t2.start();
}
}

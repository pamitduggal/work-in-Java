import java.io.*;
class buffered
{
public static void main(String args[])throws Exception
{
String s1,s2;
int a,b,sum;
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader stdin=new BufferedReader(isr);
System.out.println("Enter two numbers");
s1=stdin.readLine();
s2=stdin.readLine();
a=Integer.parseInt(s1);
b=Integer.parseInt(s2);
sum=a+b;
System.out.println("Sum="+sum);
}
}
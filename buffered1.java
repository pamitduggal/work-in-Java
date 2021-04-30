import java.io.*;
class buffered1
{
public static void main(String args[])throws Exception
{
String s1;

InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader stdin=new BufferedReader(isr);
System.out.println("Enter name");
s1=stdin.readLine();
System.out.println("Hello"+s1);
}
}
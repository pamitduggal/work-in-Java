import java.io.*;
class demothrows
{
void method() throws IOException
{
throw new IOException("Device error");
}
}
class testthrows
{
public static void main(String args[])
{
try
{
 demothrows obj=new  demothrows();
obj.method();
}
catch(Exception e)
{
System.out.println("Exception Handled");
}
System.out.println("Last Statement");
}}

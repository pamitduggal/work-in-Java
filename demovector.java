import java.util.*;
class demovector
{
public static void main(String args[])
{
Vector v=new Vector();
v.addElement("Manish");
v.addElement("Chetan");
System.out.println("Size of v is="+v.size());
System.out.println("Size of v is now="+v.capacity());

v.addElement("Suraj");
v.addElement("Rajesh");
v.insertElementAt("Ganesh",3);

System.out.println("Contents of v are"+v);
String str="Suraj";
int index=v.indexOf(str);

System.out.println(str+"is at index"+index);
v.setElementAt("Shivam",2);
v.removeElement("Aditi");

System.out.println("Size of v is="+v.size());
System.out.println("Size of v is now="+v.capacity());

}}
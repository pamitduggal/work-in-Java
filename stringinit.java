class stringinit
{
public static void main(String args[])
{
 String s1="Java1";
 String s2=new String("Java2");
 char chars[]={'a','b','c','d'};
 String s3=new String(chars);
 String s4=new String(chars,1,2);
 byte a[]={65,66,67,68,69,70};
 String s5=new String(a);
 System.out.println(s1);
 System.out.println(s2);
 System.out.println(s3);
 System.out.println(s4);
 System.out.println(s5);
}}
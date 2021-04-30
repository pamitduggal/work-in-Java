import java.util.Scanner;
class dynamicmatrixaddition
{
public static void main(String args[])
{
int a[][]=new int[2][3];
int b[][]=new int[2][3];
int s[][]=new int[2][3];
Scanner obj=new Scanner(System.in);
System.out.println(" first matrix");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
 a[i][j]=obj.nextInt();
 System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println(" Second matrix");
for(int i=0;i<b.length;i++)
{
for(int j=0;j<b[i].length;j++)
{
 b[i][j]=obj.nextInt();
 System.out.print(b[i][j]+" ");
}
System.out.println();
}

System.out.println(" Sum matrix");
for(int i=0;i<s.length;i++)
{
for(int j=0;j<s[i].length;j++)
{
 s[i][j]=a[i][j]+b[i][j];
 System.out.print(s[i][j]+" ");
}
System.out.println();
}
}}
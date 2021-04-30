import java.util.Scanner;
class jagged
{
public static void main(String args[])
{
int a[][]=new int[3][];
a[0]=new int[3];
a[1]=new int[2];
a[2]=new int[4];
Scanner obj=new Scanner(System.in);
System.out.println(" Enter matrix");
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a[i].length;j++)
{
 a[i][j]=obj.nextInt();
 System.out.print(a[i][j]+" ");
}
System.out.println();
}
}}
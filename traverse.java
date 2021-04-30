import java.util.Scanner;
public class traverse
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int arr1[][] =new int[10][10];
   for(int i=0;i<10;i++)
   {
   for(int j=0;j<10;j++)  
   {
    System.out.println("Enter the Array Elements:");
    arr1[i][j]=sc.nextInt();
   }
   }
    for(i=0;i<10;i++)
    {
    for(j=0;j<10;j++)  
    {
     System.out.println("Array Elements are : "+ arr1[i][j]);
    }
    }
  }
}
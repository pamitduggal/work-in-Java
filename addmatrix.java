import java.util.Scanner;
class addmatrix
{
 public static void main(String args[])
{
 int arr1[][]=new int[3][3];
 int arr2[][]=new int[3][3];
 int arr3[][]=new int[3][3];
 int i,j;
 System.out.print("Enter the elements of 1st Matrix:\n");
 Scanner obj=new Scanner(System.in);
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {
   arr1[i][j]=obj.nextInt();
   System.out.print(arr1[i][j]+"\t");
  }
  System.out.println();
 }
 System.out.print("Enter the elements of 2nd Matrix:\n");
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {
   arr2[i][j]=obj.nextInt();
   System.out.print(arr2[i][j]+"\t");
  }
  System.out.println();
 }
 System.out.print("Sum of Entered Numbers:\n");
 for(i=0;i<3;i++)
 {
  for(j=0;j<3;j++)
  {
   arr3[i][j]=arr1[i][j]+arr2[i][j];
   System.out.print(arr3[i][j]+"\t");
  }
  System.out.println();
 }
}
}
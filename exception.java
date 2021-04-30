class exception
{
public static void main(String args[])
{
int x=50,y=0;
int result=0;
try
{
result=x/y;	//found arithmetic exception(division by zero)
System.out.println("We are in try block");
}
catch(ArithmeticException e)
{
System.out.println("Arithmetic Exception occured");
System.out.println(e);
}
System.out.println("This is the last statement");
}
}
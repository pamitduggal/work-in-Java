class testexception extends Exception
{
testexception(String s)
{super(s);}
}
class udexception
{
static void validate(int age) throws testexception
{
if(age<18)
throw new testexception("not valid to vote");
else
System.out.println("Welcome to vote");
}
public static void main(String args[])
{
try
{
validate(15);
}
catch(Exception e)
{
System.out.println("Exception occured:"+e);
}
System.out.println("Last statement");
}
}

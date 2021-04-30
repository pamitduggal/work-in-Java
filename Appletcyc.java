import java.awt.*;
import java.applet.*;
public class aplifecycle extends applet
{
 string s;
 public void init()
 {
  s=getparameter("P");
 }
  public void start()
  {
   System.out.println("Applet Execution Started");
  }
  public void stop()
  {
    System.out.println("Applet Execution Stopped");
  }
  public void paint(Graphics g)
  {
    g.drawstring(5,200,200);
  }
  public void destroy()
  { 
   System.out.println("Applet Destroyed");
   {
     System.out.println("Applet Destroyed");
   }
 }
/*
<html>
<body>
<applet code="aplifecycle.class" height="400" width="400">
<param name =""P" value=""Applet Life cycle Executed">
</applet>
</body>
</html>
*/


interface jet
      {
        int  speed=750;
        public void distance();
      }
     
 interface propellor
     {
       int distance=250;
       public void speed();
     }
 

 class vehicle  implements jet,propellor
    {
      public void distance()
     {
      int  distance=speed*100; 
      System.out.println("Distance travelled is: "+distance);
     }
       public void speed()
     {
       int speed=distance/100;
	System.out.println("Speed of the vehicle is: "+speed);
     }
    }
       class multipleinherit
     {
        public static void main(String args[])
      {
        System.out.println("Vehicle");
       vehicle v=new vehicle();
       System.out.println("The Jet Plane And Propellor Plane");
       v.distance();
       v.speed();
      }
      }
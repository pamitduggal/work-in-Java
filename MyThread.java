class MyThread extends Thread
	  {
    	 public void run()
  	           {
     	System.out.println("My thread is running");
  	           }
       public static void main(String args[])
         {
            MyThread obj=new MyThread();
            obj.start();
         }
     }

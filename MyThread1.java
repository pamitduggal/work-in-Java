class MyThread1 implements Runnable
            { 
                public void run()
  	           {
     	     System.out.println("My thread is running");
  	           }
         public static void main(String args[])
         {
             MyThread1 obj=new MyThread1();
             Thread t1=new Thread(obj);
             t1.start();
         }
     }   
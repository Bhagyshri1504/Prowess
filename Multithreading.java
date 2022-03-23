class multithreading implements Runnable
{
     public void run()
     {
         
     }
   public static void main(String args[])
   {
       multithreading m = new multithreading();
       Thread t1=new Thread(m);//Using constructor Thread(Runnable r);
       System.out.println(t1.getName());
       t1.start();
   }
 }
    

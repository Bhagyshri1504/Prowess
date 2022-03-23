public class threadclass  extends Thread{
    public void run()
    {
        System.out.println("Hello All");
   
    }
    public static void main(String args[])
    {
         threadclass tc1=new threadclass();
         threadclass tc2=new threadclass();
         threadclass tc3=new threadclass();
         threadclass tc4=new threadclass();
         threadclass tc5=new threadclass();
         
         tc1.start();
         //tc2.start();
         //tc3.start();
         //tc4.start();
         //tc5.start();
    } 
}

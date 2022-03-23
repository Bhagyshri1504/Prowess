public class theadinterface implements Runnable
{
    public void run()
    {
        System.out.println("Hello India");
    }
    public static void main(String args[])
    {
        theadinterface ti1=new theadinterface();
        Thread t1=new Thread(ti1);
        Thread t2=new Thread(ti1);
        Thread t3=new Thread(ti1);
        Thread t4=new Thread(ti1);
        Thread t5=new Thread(ti1);
        t1.start();
        
    }
}

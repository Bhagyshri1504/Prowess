import java.util.concurrent.Executor;
public class poolthread implements{
    public class Test 
{ 
     // Maximum number of threads in thread pool 
    static final int MAX_THREADS = 5;              
  
    public static void main(String[] args) 
    { 
        // creates five tasks 
        Runnable taskA = new Task("taskA"); 
        Runnable taskB = new Task("taskB"); 
        Runnable taskC = new Task("taskC"); 
        Runnable taskD = new Task("taskD"); 
        Runnable taskE = new Task("taskE");       
          
        ExecutorService pool = Executors.newFixedThreadPool(MAX_THREADS);   
         
        pool.execute(taskA); 
        pool.execute(taskB); 
        pool.execute(taskC); 
        pool.execute(taskD); 
        pool.execute(taskE);  
          
        // pool shutdown  
        pool.shutdown();     
    } 
} 
}

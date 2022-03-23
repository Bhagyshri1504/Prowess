import java.util.*;
public class queueUsingStack
{
    private Stack stack1=new Stack<>();
     private Stack stack2=new Stack<>();
     public void enqueue(int element)
     {
         stack1.push(element);
         System.out.println(element+" Inserted");
     }
     public void dequeue()
     {
         if(stack2.isEmpty())
         {
             while (!stack1.isEmpty())
             {
                    stack2.push(stack1.pop());
             }
         }
         System.out.println(stack2.pop() +" Removed");
     }
     public static void main(String args[])
     {
         queueUsingStack q1=new queueUsingStack();
         q1.enqueue(10);
         q1.enqueue(20);
         q1.enqueue(30);
         q1.enqueue(22);
         q1.enqueue(44);
         q1.enqueue(6);
         q1.dequeue();
         q1.dequeue();
      }
}

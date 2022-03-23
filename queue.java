import java.util.*;
public class queue
{
    public static void main(String args[])
    {
        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<6;i++)
        {
            q.add(i);
            System.out.println("Element of queue" +q);
        }
        int removedele=q.remove();
        
       System.out.println("Removed element-"+ removedele);
        System.out.println(q);
    }
}

package ListAndArraylist;

import java.util.PriorityQueue;
import java.util.Queue;

public class classA
{

    public static void main(String[] args)
    {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(5);
        queue.offer(7);
        queue.offer(8);
        queue.offer(14);
        System.out.println("Elements in the queue:"+queue);
    }
}


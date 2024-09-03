package apr8;

import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueue {
    public static void main(String[] args) {
        Queue<String>Queue=new PriorityQueue<>();
        Queue.offer("one");
        Queue.offer("two");
        System.out.println(Queue);
        System.out.println(Queue.poll());
        System.out.println(Queue.poll());
        System.out.println(Queue.poll());
        System.out.println(Queue.peek());
    }
}

package apr8;

import java.util.PriorityQueue;
import java.util.Queue;

public class displayusingQueue {
    public static void main(String[] args) {
        Queue<Character>q=new PriorityQueue<>();
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');
        while (!q.isEmpty()){
            System.out.print(q.peek());
            System.out.print(q.poll());
        }
        System.out.println();
        System.out.println(q.peek());
    }
}

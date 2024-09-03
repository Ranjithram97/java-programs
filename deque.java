package apr8;

import java.util.ArrayDeque;

public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer>deq=new ArrayDeque<>();
        deq.add(20);
        deq.addFirst(40);
        deq.addLast(60);
        deq.addFirst(80);
        deq.add(100);
        deq.addFirst(120);
        System.out.println(deq);
        System.out.println(deq.peekFirst()+" "+deq.removeFirst());
        System.out.println(deq.peekLast()+" "+deq.removeLast());
    }
}

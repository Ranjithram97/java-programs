package apr8;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class deletelastanddispusingiterator {
    public static void main(String[] args) {
        ArrayDeque<Integer>q= new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.removeLast();
        Iterator<Integer>it=q.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

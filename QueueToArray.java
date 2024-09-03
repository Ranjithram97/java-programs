package apr8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueToArray {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        int []arr=new int[q.size()];
        Iterator<Integer> it=q.iterator();
        for(int i=0;it.hasNext();i++){
            arr[i]= it.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}

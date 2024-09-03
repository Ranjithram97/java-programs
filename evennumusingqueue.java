package apr8;

import java.util.PriorityQueue;
import java.util.Queue;

public class evennumusingqueue {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            if(q.peek()%2 == 0){
                System.out.print(q.poll()+" ");
                continue;
            }
            q.poll();
        }
    }
}

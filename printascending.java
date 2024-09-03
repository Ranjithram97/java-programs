package apr8;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class printascending {
    public static void main(String[] args) {
        Queue<Integer> q=new PriorityQueue<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            q.add(sc.nextInt());
        }
        while (!q.isEmpty()){
            System.out.print(q.poll()+" ");
        }
    }
}

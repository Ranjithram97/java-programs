import java.util.*;
import java.lang.*;
class theif {
    public static void theif(int[] a,int[] res1,int[] res2) {
        for (int i = 2, j1 = 0; i < a.length; i++, j1++) {
            res1[i] = a[i] + res1[j1];
        }
        for (int i = 3, j2 = 0; i < a.length; i++, j2++) {
            res2[i] = a[i] + res2[j2];
        }
        int max1=max(res1);
        int max2=max(res2);
        int max = Math.max(max1,max2);
        System.out.println(max);
    }
    public static int max(int m[]){
        int n=m.length;
        int max=m[0];
        for(int i=0;i<n;i++){
            if(m[i]>max)
                max=m[i];
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n");
        int n = s.nextInt();
        System.out.println("Enter array");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int[] res1 = new int[n];
        int[] res2 = new int[n];
        for (int i = 0; i < 2; i++) {
            res1[i] = a[i];
            res2[i] = a[i];
        }
        theif(a,res1,res2);
    }
}
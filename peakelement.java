
import java.util.*;
public class peakelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=s.nextInt();
        }
        int max=0;
        for(int i=1;i<n-1;i++){
            if(a[i-1]<=a[i]&&a[i]>=a[i+1]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}

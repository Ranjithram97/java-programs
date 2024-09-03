import java.util.*;
public class houserobber {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for (int i = 0; i < n; i+=2) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}

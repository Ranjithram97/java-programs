package hashset;
import java.lang.*;
import java.util.*;

public class happynumusinghashset {
    public static boolean ishappy(int n){
        HashSet<Integer>usedno=new HashSet<>();
        while(true){
            int sum=0;
            while (n!=0){
                int rem=n%10;
                sum+=Math.pow(rem,2);
                n/=10;
            }
            if(sum==1)
                return true;
            n=sum;
            if(usedno.contains(n))
                return false;
            usedno.add(n);
        }
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(ishappy(n));
    }
}

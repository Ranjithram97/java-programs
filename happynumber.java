import java.util.*;
public class happynumber {
    public static boolean happy(int num){
        HashSet<Integer>hs=new HashSet<>();
        while(num>0){
            int sum=0;
            while(num>0){
                int rem=num%10;
                sum= (int) Math.pow(rem,2)+sum;
                num/=10;
            }
            if(sum==1)
                break;
            if(hs.contains(sum))
                return false;
            hs.add(sum);
            num=sum;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(happy(num));
    }
}

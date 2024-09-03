import java.util.ArrayList;
import java.util.HashSet;

public class uniquenumbers {
    public static void main(String[] args) {
        int a=11;
        int b=33 ;
        int count=0;
        HashSet<Integer>rem=new HashSet<>();
        while(a<=b){
            int aa=a;
            rem.clear();
            while(aa!=0){
                if(rem.contains(aa%10)) {
                    count--;
                    break;
                }
                rem.add(aa%10);
                aa/=10;
            }
            a++;
            count++;
        }
        System.out.println(count);
    }
}

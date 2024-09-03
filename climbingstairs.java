import java.util.*;
public class climbingstairs {
    public static void climb(int curr,int end,String ans,int count){
        if(curr==end){
            System.out.println(count +" "+ans);
            return;
        }
        if(curr>end){
            return;
        }
        climb(curr+1,end,ans+1,count);
        climb(curr+2,end,ans+2,count);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        climb(0,n,"",1);

    }
}

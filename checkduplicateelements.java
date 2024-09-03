import java.util.*;
public class checkduplicateelements {
    public static boolean dup(int[] arr){
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            if(hs.contains(arr[i]))
                return true;
            hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]arr={1,2,3,4,1};
        System.out.println(dup(arr));
    }
}

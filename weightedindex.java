package apr5;

import java.util.HashMap;

public class weightedindex {
    public static char last;
    public static HashMap<Character,Integer> weight(HashMap<Character,Integer> hash,int x){
        char st='a';
        int val=1;
        int count=1;
        while(val<x) {
            hash.put(st, val);
            st++;
            count++;
            val = (count * val) + val;
        }
        last = st;
        return hash;
    }

    public static void main(String[] args) {
        int target=20;
        String ans = "";
        HashMap<Character,Integer> hash=new HashMap<>();
        HashMap<Character,Integer> hash1=weight(hash,target);
        while(target> 0){
             while(target >= hash1.get(last) && ((target % hash1.get(last) >= 0))){
                target -= hash.get(last);
                ans = last + ans;
            }
            last--;
        }
        System.out.println(ans);
    }
}

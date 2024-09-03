import java.util.*;
public class hashmappairs {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="a a b b a a";
        String s2="hi hi how how you you";
        String []arr1=s1.split(" ");
        String []arr2=s2.split(" ");
        HashMap<String,String>m1=new HashMap<>();
        HashMap<String,String>m2=new HashMap<>();
        for(int i=0;i< arr1.length;i++){
            String key=arr1[i];
            String value=arr2[i];
            m1.put(key,value);
            m2.put(value,key);
        }
        //m1.get(m2.re)
    }
}

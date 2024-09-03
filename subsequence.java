import java.util.Arrays;

public class subsequence {
    public static void main(String[] args) {
        String s1="abc";
        String s2="ahbjcv";
        int i=0;
        for(int j=0;j<s2.length();j++){
            if(i<s1.length() && s1.charAt(i)==s2.charAt(j)){
                i++;
            }
        }
        if(i==s1.length())
            System.out.println("True");
        else
            System.out.println("False");
    }
}

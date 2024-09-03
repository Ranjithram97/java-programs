import java.util.*;
public class anagramoftwostrings {
    public static String sort(char[] arr){
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="silent";
        String s2="LISTEN";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char [] res1=s1.toCharArray();
        char [] res2=s2.toCharArray();
        String s11=sort(res1);
        String s21=sort(res2);
        if(s11.equals(s21))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

import java.util.*;
public class lengthoflastword {
    public static void main(String[] args) {
        String s="Hello World";
        Stack<String> stk=new Stack<>();
        String[] st=s.split(" ");
        for (int i = 0; i <st.length; i++) {
            stk.push(st[i]);
        }
        String ans=stk.pop();
        System.out.println(ans.length());
    }
}

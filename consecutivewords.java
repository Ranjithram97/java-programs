import java.util.*;
public class consecutivewords {
    public static void main(String[] args) {
        String s="tom jerry jerry tom";
        String[]arr=s.split(" ");
        Stack<String>stk=new Stack<>();
        stk.push(arr[0]);
        for(int i=1;i< arr.length;i++){
            if(Objects.equals(stk.peek(), arr[i]))
                stk.pop();
            else
                stk.push(arr[i]);
        }
        if(stk.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}

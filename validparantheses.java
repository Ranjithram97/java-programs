import java.util.*;
public class validparantheses {
    public static void main(String[] args) {
          String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        s=sc.nextLine();
        Stack<Character>stk=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{')
                stk.push('}');
            else if(s.charAt(i)=='(')
                stk.push(')');
            else if(s.charAt(i)=='[')
                stk.push(']');
            else{
                if(!stk.isEmpty()&&stk.peek()==s.charAt(i))
                    stk.pop();
            }
        }
        if(stk.isEmpty())
            System.out.println(true);
        else
            System.out.println(false);
    }
}

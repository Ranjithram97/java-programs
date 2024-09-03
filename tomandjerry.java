import java.util.Scanner;
import java.util.Stack;
public class tomandjerry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String str=sc.nextLine();
        Stack<String> st=new Stack<>();
        String[]res=str.split(" ");
        st.push(res[0]);
        for(int i=1;i<res.length;i++){
            if( !st.isEmpty() && st.peek().equals(res[i]) )
            {
                st.pop();
            }
            else{
                st.push(res[i]);
            }
        }
        if(st.isEmpty())
            System.out.println("true");
        else
            System.out.println("false");
    }
}

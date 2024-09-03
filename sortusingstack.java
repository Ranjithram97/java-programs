import java.util.*;
public class sortusingstack {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        System.out.println("Enter number of elements you Enter");
        int n=s.nextInt();
        System.out.println("Enter Elements");
        for(int i=0;i<n;i++){
            int var=s.nextInt();
            st.push(var);
        }
        temp.push(st.pop());
        while(!st.isEmpty()){
            if(st.peek()>temp.peek()){
                temp.push(st.pop());
            }
            else {
                int c = st.pop();
                while (!temp.isEmpty() && c < temp.peek()) {
                    st.push(temp.pop());
                }
                temp.push(c);
            }
        }
        System.out.println(temp);
    }
}

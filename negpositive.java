import java.util.*;
public class negpositive {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[]arr={4,3,-2,8,0,10,-5};
        Stack<Integer> pos=new Stack<>();
        Stack<Integer> neg=new Stack<>();
        Stack<Integer> zero=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        for (int l = 0; l < arr.length; l++) {
           if(arr[l]>0)
               pos.push(arr[l]);
           if(arr[l]<0)
               neg.push(arr[l]);
           if(arr[l]==0)
               zero.push(arr[l]);
        }
        int i=0;
        while(!neg.isEmpty()||!pos.isEmpty()){
            if(!neg.isEmpty() && i%2==0){
                res.add(neg.pop());
                i++;
            }
            else {
                res.add(pos.pop());
                i++;
            }
        }
        while(!zero.isEmpty()){
            res.add(zero.pop());
            i++;
        }
        System.out.println(res);
    }
}

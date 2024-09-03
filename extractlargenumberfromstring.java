import java.util.ArrayList;
import java.util.Collections;
public class extractlargenumberfromstring {
    public static void main(String[] args) {
        String str="This is alpha 5057 and 97 ";
        String[] arr=str.split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i< arr.length;i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                int num=Integer.valueOf(arr[i]);
                list.add(num);
            }
        }
        Collections.sort(list);
        System.out.println(list.getLast());
    }
}

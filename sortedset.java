package apr8;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {
    public static void main(String[] args) {
        SortedSet obj=new TreeSet();
        obj.add(13);
        obj.add(34);
        obj.add(6);
        obj.add(21);
        obj.add("STRING");
        obj.add('c');
        System.out.println(obj);

    }
}

import java.util.*;
public class stringanagram {
    public static void main(String[] args) {
      String s1="abc";
      String s2="ajBocy";
      s1=s1.toLowerCase();
      s2=s2.toLowerCase();
      int count=0;
      int i=0,j=0;
      while(count!=s1.length()){
          if(s1.charAt(i)==s2.charAt(j)){
              count++;i++;
          }
          j++;
          if(s2.length()-1==j)
              break;
      }
      if(s1.length()==count)
          System.out.println(true);
      else
          System.out.println(false);
    }
}

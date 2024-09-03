package apr8;

public class goodstring {
    public static void main(String[] args) {
        String s="leEeetcode";
        char[]c=s.toCharArray();
        for(int i=1;i<s.length()-1;i++){
            if(c[i] >=97 && c[i] <= 122 && c[i-1] >= 65 && c[i-1] <= 90){
                c[i]=0;
                c[i-1]=0;
            }
            else if( c[i-1] >=97 && c[i-1] <= 122 && c[i] >= 65 && c[i] <= 90){
                c[i]=0;
                c[i+1]=0;
            }
        }
        String str="";
        for(int i=0;i<c.length;i++){
            if(c[i]==0)
                continue;
            str+=c[i];
        }
        System.out.println(str);
    }
}

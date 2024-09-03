public class anagram {
    public static void main(String[] args) {
        String s1="eat";
        String s2="ate";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        int count=0;
        if(s1.length()!=s2.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }
        else{
            for(int i=0,j=0;i<s1.length();j++){
                if(c1[i]==c2[j]) {
                    count++;
                    c1[i]=0;
                    c2[i]=0;
                }
                if(j==s2.length()-1){
                    i++;
                    j=-1;
                }
            }
            if(count==s1.length()){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
    }
}

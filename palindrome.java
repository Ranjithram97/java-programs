public class palindrome {
    public static boolean ispalindrome(String str){
        int i=0,j=str.length()-1;
        while(i!=j){
            if(str.charAt(i)==str.charAt(j)){
                i++;j--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(str);
        System.out.println(ispalindrome(str));
    }
}

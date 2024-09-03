public class binaryoddeven {
    public static boolean isodd(int n){
        if((n&1)==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n=100001;
        if (isodd(n))
            System.out.println("The given number "+n+" is Odd.");
        else
            System.out.println("The given number "+n+" is Even.");
    }
}

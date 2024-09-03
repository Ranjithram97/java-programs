package apr6;
public class primesum {
    public static boolean isprime(int n){
        int c=2,count = 0;
        while(c*c<=n)
        {
            if(n%c==0)
            {
                count++;
                break;
            }
            c++;
        }
        if (count==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s="12";

    }
}

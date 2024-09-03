public class primepairs {
    public static int isprime(int n){
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
            return n;
        else
            return 0;
    }
    public static void main(String[] args) {
        int st=4;
        int en=30;
        int val1=0,val2=0,j=0,count=0;
        for (int i=st;i<=en;i++){
            val1=isprime(i);
            j=i+6;
            val2=isprime(j);

            if(val1!=0 && val2!=0){
                System.out.println(val1+" "+val2);
                count++;
            }
        }
        System.out.println("Count is:"+count);
    }
}

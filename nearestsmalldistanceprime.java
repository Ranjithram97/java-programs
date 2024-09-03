public class nearestsmalldistanceprime {
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
        int[]arr={51,12,65};
        for(int i=0;i<arr.length;i++){
            int prev=arr[i],next=arr[i];
            int pr=0,ne = 0;
            while(prev!=0){
                pr=isprime(prev);
                prev--;
                if(pr!=0)
                    break;
            }
            while(next!=0){
                ne=isprime(next);
                next++;
                if(ne!=0)
                    break;
            }
            int p=arr[i]-prev;
            int q=next-arr[i];
            if(p<=q){
                System.out.println(pr);
            }
            else{
                System.out.println(ne);
            }
        }
    }
}

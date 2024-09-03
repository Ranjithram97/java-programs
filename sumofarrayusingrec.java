public class sumofarrayusingrec {
    public static void sum(int a[],int n,int s,int i){
        if(i<n){
            s+=a[i];
            sum(a,n,s,i+1);
        }
        else{
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        int[]a={0,1,2,3,4};
        int n=a.length;
        sum(a,n,0,0);
    }
}

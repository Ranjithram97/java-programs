public class findtwoval {
    public static void main(String[] args) {
        int []arr={16,4,23,8,15,42,1,2};
        int n=arr.length;
        int x=19;
        for(int i=0,j=i+1;j<n;j++){
            if(arr[i]+arr[j]==x){
                System.out.println(i+" "+j);
                //System.exit(0);
            }
            if(j==n-1){
                i++;
                j=i;
            }
        }
    }
}

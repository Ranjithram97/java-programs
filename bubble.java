public class bubble {
    public static final int[] bubb(int a[],int len){
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(a[j]<=a[i]){
                    int swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int arr[]={6,1,2,4,3,5};
        int n= arr.length;
        int res[]=bubb(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}

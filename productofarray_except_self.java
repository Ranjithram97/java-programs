public class productofarray_except_self {
    public static final int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int pre=1,post=1;
        for(int i=0;i<n;i++){
            res[i]=1;
        }
        for(int i=0;i<n;i++){
            res[i]*=pre;
            pre*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=post;
            post*=nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int[] res=productExceptSelf(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

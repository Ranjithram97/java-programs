public class prefixsum {
    public static final int[] productExceptSelf(int[] nums) {
    int n=nums.length;
    int[] res=new int[n];
    for(int i=0;i<n;i++){
        res[i]=nums[i];
    }
    int pre=res[0];
    for(int i=1;i<n;i++){
        res[i]+=pre;
        pre+=nums[i];
    }
    return res;
}
    public static void main(String[] args) {
        int arr[]={3,2,3,4,5};
        int[] res=productExceptSelf(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}

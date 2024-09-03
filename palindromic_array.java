import java.util.ArrayList;

public class palindromic_array {
    public static void main(String[] args) {
        int []arr={5,3,3,4};
        int n=arr.length;
        int count=0;
        int l=0,r=n-1;
        while(l<r){
            if(arr[l]<arr[r]){
                arr[l+1]+=arr[l];
                count++;
                l++;
            }
            else if(arr[l]>arr[r]){
                arr[r]+=arr[r-1];
                count++;
                r--;
            }
            else{
                l++;r--;
            }
        }
        System.out.println(count);
    }
}

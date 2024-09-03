import java.util.*;
public class mergesort {
    public static final int[] merge(int a[],int low,int high){
        if(low==high){
            int[]b=new int[1];
            b[0]=a[low];
            return b;
        }
        int mid=(low+high)/2;
        int res1[]=merge(a,low,mid);
        int res2[]=merge(a,mid+1,high);
        return mergetwosortedarray(res1,res2);
    }
    public static int[] mergetwosortedarray(int[]res1,int[]res2){
        int []res=new int[res1.length+res2.length];
        int i=0,j=0,k=0;
        while (i < res1.length && j < res2.length) {
            if (res1[i] <= res2[j]) {
                res[k] = res1[i];
                k++;i++;
            } else {
                res[k] = res2[j];
                k++;j++;
            }
        }
        while (i < res1.length) {
            res[k] = res1[i];
            k++;i++;
        }
        while (j < res2.length) {
            res[k] = res2[j];
            k++;j++;
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={9,8,7,6,5,4,3,2,1};
        int low=0;
        int high=a.length-1;
        int []res=merge(a,low,high);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }

    }
}

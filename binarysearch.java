public class binarysearch {
    public static int bin(int arr[],int x,int low,int high)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            if(arr[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,6,7,8,9};
        int n=arr.length;
        int x=7;
        int result=bin(arr,x,0,n-1);
        if(result!=-1)
            System.out.println("Element Found at index "+result);
        else
            System.out.println("Element Not Found!!");
    }
}

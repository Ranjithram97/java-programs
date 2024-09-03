public class occurence {
    public static int occ(int arr[],int n,int x)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,3,4,7,8,8};
        int n=arr.length;
        int x=2;
        int res=occ(arr,n,x);
        System.out.println("It Occures "+res+" times!!");
    }
}

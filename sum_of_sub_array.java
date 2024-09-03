public class sum_of_sub_array {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        int i,j,k,sum,a=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<=n;j++)
            {
                sum=0;
                for(k=i;k<j;k++)
                {
                    sum=sum+arr[k];
                    if(sum>a) {
                        a=sum;
                    }
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
                System.out.println("sum is="+sum);
            }
        }
        System.out.println("Max value is:" +a);
    }
}

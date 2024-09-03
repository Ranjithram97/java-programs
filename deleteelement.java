public class deleteelement {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5};
        int s1= arr.length;
        int[] del=new int[s1];
        int x=2,k=0,count=0;
        for(int i=0;i<s1;i++)
        {
            if(arr[i]==x){
                count++;
                continue;
            }
            del[k]=arr[i];
            k++;
        }
        if(count>=1)
            s1-=count;
        for (int j = 0; j <s1; j++) {
            System.out.print(del[j]+" ");
        }
    }
}

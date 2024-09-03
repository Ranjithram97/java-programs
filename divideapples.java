import java.util.Arrays;
import java.util.Scanner;

public class divideapples {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int[]arr=new int[n];
        int sum=0;
        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        sum/=n;
        while(arr[0]>sum && arr[n-1]<sum || arr[0]<sum && arr[n-1]>sum){
            if(arr[0]<sum && arr[n-1]>sum){
                arr[0]++;
                arr[n-1]--;
            }
            else{
                arr[0]--;
                arr[n-1]++;
            }
        }
        for(int j=n-2;j>0;j--){
            for(int i=j;i>=0;i--){
                if(i!=0 && arr[i]>arr[i-1] && arr[i-1]<=sum){
                    while(arr[i]>arr[i-1] && arr[i-1]<=sum){
                        arr[i]--;
                        arr[i-1]++;
                    }
                }
                else{
                    while(i!=0 && arr[i]<=sum && arr[i-1]>arr[i-1]){
                        arr[i]++;
                        arr[i-1]--;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

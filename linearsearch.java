import java.util.Scanner;

public class linearsearch {
    public static void linear(int[]a,int n,int i){
        if(i==0) {
            System.out.println("Element Not found!!");
            System.exit(0);
        }
        if(a[i]==n){
            System.out.println("Element found at index " + i);
            System.exit(0);
        }
        linear(a,n,i-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i= arr.length-1;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Element to Search:");
        int num=s.nextInt();
        linear(arr,num,i);
    }
}

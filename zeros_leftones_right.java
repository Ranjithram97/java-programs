import java.util.Arrays;

public class zeros_leftones_right {
    public static void main(String[] args) {
        int[]arr={1,1,0,0,0};
        int x=0;
        for(int i=0,j=i+1;i<arr.length-1;j++){
            if(arr[i]!=x ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(j==arr.length-1){
                i++;
                j=i;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

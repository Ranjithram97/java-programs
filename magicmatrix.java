import java.util.*;
public class magicmatrix {
    public static void main(String[] args) {
        int [][]arr={{2,7,6},{9,5,1},{4,3,8}};
        int m=8,count=0,sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=arr[i][j];
            }
            if(sum==15){
                count++;
                sum=0;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum+=arr[j][i];
            }
            if(sum==15){
                count++;
                sum=0;
            }
        }
        for(int i=0,j=2;i<3;i++,j--){
            sum+=arr[i][j];
            if(sum==15){
                count++;
                sum=0;
            }
        }
        for(int i=0;i<3;i++){
            sum+=arr[i][i];
            if(sum==15){
                count++;
                sum=0;
            }
        }
        if(count==m)
            System.out.println("It is a Magic matrix");
        else
            System.out.println("It is not a Magic matrix");
    }
}

import java.util.*;
public class lowertriangle {
    public static void main(String[] args) {
        int m,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter row for Matrix:");
        m=s.nextInt();
        System.out.print("Enter column for Matrix:");
        n=s.nextInt();
        int arr1[][]=new int[m][n];
        System.out.println("Enter Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After deleting,we get");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    System.out.print(arr1[i][j]+" ");
                else if(i>(j-i)){
                    System.out.print(arr1[i][j]+" ");
                }
                else{
                    arr1[i][j]=0;
                    System.out.print(arr1[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}

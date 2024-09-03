import java.util.*;
public class matrixadd {
    public static void main(String[] args) {
        int m,n,o,p;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter row for 1st Matrix:");
        m=s.nextInt();
        System.out.print("Enter column for 1st Matrix:");
        n=s.nextInt();
        int arr1[][]=new int[m][n];
        System.out.println("Enter Elements:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.print("Enter row for 2nd Matrix:");
        o=s.nextInt();
        System.out.print("Enter column for 2nd Matrix:");
        p=s.nextInt();
        int arr2[][]=new int[o][p];
        System.out.println("Enter Elements:");
        for(int i=0;i<o;i++){
            for(int j=0;j<p;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        int arr3[][]=new int[m][n];
        if(m==o && n==p){
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
            }
            System.out.println("After adding two arrays,we get");
            for(int k=0;k<m;k++){
                for(int l=0;l<n;l++){
                    System.out.print(arr3[k][l]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Rows and columns are not equal.");
    }
}

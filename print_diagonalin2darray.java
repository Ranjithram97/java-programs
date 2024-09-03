import java.util.*;
public class print_diagonalin2darray {
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
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Diagonal values from Left are:");
        for(int k=0;k<m;k++) {
            System.out.print(arr1[k][k] + " ");
        }
        System.out.println();
        System.out.println("Diagonal values from Right are:");
        for(int x=0,y=m-1;x<m;x++,y--) {
            System.out.print(arr1[x][y] + " ");
        }

    }
}

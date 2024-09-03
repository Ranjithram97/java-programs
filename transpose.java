import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=3,n=3;
        int arr[][]=new int[m][n];
        System.out.println("Enter elements:");
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j]=s.nextInt();
            }
        }
        int arrt[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j < n; j++) {
                arrt[i][j]=arr[j][i];
                System.out.print(arrt[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Reverse is:");
        for(int i=0;i<m;i++){
            for (int j = n-1; j>=0; j--) {
                System.out.print(arrt[i][j]+" ");
            }
            System.out.println();
        }

    }
}

import java.util.*;
public class maxineachcolumn {
    public static void main(String[] args) {
        int m=3,n=2;
        Scanner s=new Scanner(System.in);
        int marks[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                marks[i][j]=s.nextInt();

            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
        int max=marks[0][0];
        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (marks[j][i] >= max) {
                    max = marks[j][i];
                }
            }
            System.out.println("Maximum element is:" + max);
            for (int k = 0; k < m; k++) {
                for (int l = 0; l < n; l++) {
                    if (marks[k][l] == max) {
                        System.out.println("Index is:" +k+"," +l);
                    }
                }
            }
        }
    }
}

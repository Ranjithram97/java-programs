import java.util.*;
public class twodarray {
    public static void main(String[] args) {
        int m=4,n=3;
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
    }
}

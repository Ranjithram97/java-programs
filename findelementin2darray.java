import java.util.*;
public class findelementin2darray {
    public static void main(String[] args) {
        int m=4,n=3;
        Scanner s=new Scanner(System.in);
        int marks[][]=new int[m][n];
        int x=12;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                marks[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(marks[i][j]==x){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

import java.util.*;
public class findmaxin2darray {
    public static void main(String[] args) {
        int m=2,n=2;
        Scanner s=new Scanner(System.in);
        int marks[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                marks[i][j]=s.nextInt();

            }
        }
        int max=marks[0][0];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(marks[i][j]>=max){
                    max=marks[i][j];
                }
            }
        }
        System.out.println("Maximum element is:"+max);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(marks[i][j]==max){
                    System.out.println("Index is:"+i+","+j);
                }
            }
        }
    }
}

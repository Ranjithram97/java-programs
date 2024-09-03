import java.util.Scanner;
public class lucassequence {
    public static final void luc(int n,int a,int b,int c){
            if(n>3){
                int sum=a+b+c;
                a=b;
                b=c;
                c=sum;
                System.out.println(sum);
                luc(n-1,a,b,c);
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,a=0,b=1,c=1;
        System.out.println("Enter Range");
        n=s.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        luc(n,a,b,c);
    }
}
import java.util.Scanner;
public class multableusingrec {
    public static final int mul(int num,int i,int n){
        if(i>n)
            System.exit(0);
        System.out.println(num+"*"+i+"="+num*i);
        mul(num,i+1,n);
        return num;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=s.nextInt();
        System.out.print("Enter Range:");
        int range=s.nextInt();
        mul(num,1,range);
    }
}

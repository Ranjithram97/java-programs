import java.util.Scanner;

public class calcpowerusingrec {
    public static int pow(int num,int pow){
        if(pow==1)
            return num;
        int res=num*pow(num,pow-1);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        System.out.print("Enter Power Value:");
        int pow=sc.nextInt();
        int res=pow(num,pow);
        System.out.println(num+"^"+pow+" = "+res);
    }
}

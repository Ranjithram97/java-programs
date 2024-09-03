import java.util.Scanner;
public class Fibonacci {
    public static final int fib(int c){
        if(c==1 || c==0)
            return c;
        else
            c=fib(c-1)+fib(c-2);
        return c;
    }
    public static void main(String[] args) {
        int num;//index
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum= fib(num);
        System.out.println("Fibonacci of "+num+" is "+sum);
    }
}

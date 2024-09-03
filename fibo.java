package helloworld;

import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        int a=0,b=1,count=2,temp,n;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the Range:");
        n=in.nextInt();
        while(count<n)
        {
            temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println("Fibonacci Series For range "+n+"is:");
        System.out.println(b);

    }
}

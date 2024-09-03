import java.util.Scanner;
public class Sumof_n_natural {
    public static int sum(int num){
        if(num==0){
            return 0;
        }
        else{
            int sum= sum(num - 1)+num;
            return sum;
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum= sum(num);
        System.out.println("Sum of "+num+" numbers is "+sum);
    }
}

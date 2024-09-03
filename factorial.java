import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=s.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
            if(num==fact){
                System.out.println("The given number "+num+" is Factorial Number");
                break;
            }
        }
        if(num!=fact){
            System.out.println("The given number "+num+" is not a Factorial Number");
        }
    }
}

import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int c=2,num= i.nextInt(),count = 0;
        while(c*c<=num)
        {
            if(num%c==0)
            {
                count++;
                break;
            }
            c++;
        }
        if (count==0)
        {
            System.out.println("It is prime number");
        }
        else {
            System.out.println("It is not a prime Number");
        }
    }
}

import java.util.Scanner;

public class climbstairs {
    public static final int climb(int c){
        if(c==2 || c==3)
            return c;
        else
            c=climb(c-1)+climb(c-2);
        return c;
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a Number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        int sum= climb(num);
        System.out.println("You Climb stairs for "+num+" steps using "+sum+" ways!!");
    }
}


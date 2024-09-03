import java.util.Scanner;

public class leftrightrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="laptop",temp,temp2;
        System.out.println("1.Left rotate\n2.Right rotate");
        System.out.println("Enter choice");
        int ch=sc.nextInt(),n;
        switch(ch){
            case 1:
                System.out.println("Enter the no.of position to left rotate");
                n=sc.nextInt();
                temp=s.substring(0,n);
                temp2=s.substring(n,s.length());
                temp2+=temp;
                System.out.println(temp2);
                break;
            case 2:
                System.out.println("Enter the no.of position to Right rotate");
                n=sc.nextInt();
                n=s.length()-n;
                temp=s.substring(n,s.length());
                temp2=s.substring(0,n);
                temp2=temp+temp2;
                System.out.println(temp2);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}

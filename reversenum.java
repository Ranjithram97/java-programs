package helloworld;

public class reversenum {
    public static void main(String[] args) {
        int num=12345;
        int sum=0,rem;
        while(num>0)
        {
            rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        System.out.println("The reversed Number is:"+sum);
    }
}

public class hackthemoney {
    public static void main(String[] args) {
        int amt=1;
        int expected=200;
        if(amt==expected){
            System.out.println("yes");
            System.exit(0);
        }
        while(amt<=expected){
            if(amt==expected){
                System.out.println("yes");
                System.exit(0);
            }
            if(expected%10==0 && expected%20!=0){
                amt*=10;
            }
            else if(amt%10==0){
                amt*=10;
            }
            else {
                amt*=20;
            }
        }
        System.out.println("no");
    }
}

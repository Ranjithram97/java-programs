public class crownpattern {
    public static void main(String[] args) {
        int n=5,spaces=2*(n-1);
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k<=spaces; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces-=2;
        }
    }
}

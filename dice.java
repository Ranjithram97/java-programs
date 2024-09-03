public class dice {
    static int count=1;
    public static void dice(int curr,int end,String ans){
        if(curr==end){
            System.out.println(count++ +" "+ans);
            return;
        }
        if(curr>end){
            return;
        }
        dice(curr+1,end,ans+"1");
        dice(curr+2,end,ans+"2");
        dice(curr+3,end,ans+"3");
        dice(curr+4,end,ans+"4");
        dice(curr+5,end,ans+"5");
        dice(curr+6,end,ans+"6");
    }
    public static void main(String[] args) {

        dice(0,4," ");
    }
}

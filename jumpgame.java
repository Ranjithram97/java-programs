public class  jumpgame {
    public static boolean jump(int arr[]){
        int finals=arr.length-1;
        for(int i=arr.length-2;i>=0;i--){
            if(i+arr[i]>= finals){
                finals=i;
            }
        }
        if(finals==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,5,2,1,0,0,1,3};
        boolean res=jump(arr);
        System.out.println(res);
   }
}

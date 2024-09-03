public class majorityelement {
    public static int maj(int arr[]){
        int len=arr.length;
        for(int i=0;i<len;i++){
            int count=0;
            for(int j=0;j<len;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(len/2)){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,4,2};
        int res=maj(arr);
        System.out.println("Majority is:"+res);
    }
}

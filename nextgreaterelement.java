public class nextgreaterelement {
    public static void main(String[] args) {
        int[]arr={1,0,3,8,5};
        int[]res=new int[arr.length];
        for(int i=0,j=0;j<arr.length;j++){
            if(arr[i]<arr[j]){
                res[i]=arr[j];
                j=i;
                i++;
            }
            res[i]=-1;
        }
        res[res.length-1]=-1;
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
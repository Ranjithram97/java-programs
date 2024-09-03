public class Exam {
    public static void occ(int arr[],int x,int i,int count){
        if(i==arr.length) {
            System.out.print(count);
            return;
        }
        if(x==arr[i]){
            count++;
        }
        occ(arr,x,i+1,count);
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,5,8,5};
        int x=5;
        occ(arr,x,0,0);
    }
}

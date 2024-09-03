public class mergearray {
    public static void main(String[] args) {
        int[] arr1 ={1,3,5,7};
        int s1=arr1.length;
        int[] arr2 ={2,4,6,8};
        int s2=arr2.length;
        int s3=s1+s2;
        System.out.println(s3);
        int []arr3=new int[s3];
        int i=0,j=0,k=0;
        while (i < s1 && j < s2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k] = arr1[i];
                k++;i++;
            } else {
                arr3[k] = arr2[j];
                k++;j++;
            }
        }
        while (i < s1) {
            arr3[k] = arr1[i];
            k++;i++;
        }
        while (j < s2) {
            arr3[k] = arr2[j];
            k++;j++;
        }
        for (int l = 0; l <s3 ; l++) {
            System.out.print(arr3[l]+" ");

        }

    }
}

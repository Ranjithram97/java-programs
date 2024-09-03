public class identicalTrees {
    static int i=0;
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void convertToArray(Node root, int []arr){
        if(root==null){
            return ;
        }
        convertToArray(root.left,arr);
        arr[i++]=root.data;
        convertToArray(root.right,arr);
    }
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    public static void main(String[] args) {
        Node r1=new Node(3);
        r1.left=new Node(1);
        r1.right=new Node(4);
        Node r2=new Node(3);
        r2.left=new Node(1);
        r2.right=new Node(4);
        if (count(r1) != count(r2)) {
            System.out.println(false);
            System.exit(0);
        }
        int []arr1=new int[count(r1)];
        int []arr2=new int[count(r2)];
        convertToArray(r1,arr1);
        i=0;
        convertToArray(r2,arr2);
        int count=0;
        for (int j = 0; j <count(r1) ; j++) {
            if(arr1[j]==arr2[j])
                count++;
        }
        if(count==count(r1))
            System.out.println(true);
        else
            System.out.println(false);
    }
}

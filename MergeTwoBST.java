import java.util.Arrays;
public class MergeTwoBST {
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
    public static Node BST(Node root, int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=BST(root.left,val);
        }
        else{
            root.right=BST(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void convertToArray(Node root,int []arr){
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
    public static Node mid(int[] arr ,int low ,int high,Node root){
        if(low>high){
            return null;
        }
        if(low<high){
            int res=(low+high)/2;
            root=BST(root,arr[res]);
            mid(arr,low,res-1,root);
            mid(arr,res+1,high,root);
        }
        if(low==high){
            root=BST(root,arr[low]);
        }
        return root;
    }
    public static void main(String[] args) {
        Node r1=new Node(3);
        r1.left=new Node(1);
        r1.left.left=new Node(10);
        r1.right=new Node(4);
        Node r2=new Node(6);
        r2.left=new Node(5);
        r2.right=new Node(9);
        int c=count(r1)+count(r2);
        int[] arr=new int[c];
        convertToArray(r1,arr);
        convertToArray(r2,arr);
        Arrays.sort(arr);
        Node root=null;
        root=mid(arr,0,arr.length-1,root);
        inorder(root);
    }
}
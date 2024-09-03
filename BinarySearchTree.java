public class BinarySearchTree {
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
    public static Node BST(Node root,int val){
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
    public static void main(String[] args) {
        int[]arr={3,5,6,8,10,11,12};
        Node root=null;
        for(int i=0;i< arr.length;i++){
            root=BST(root,arr[i]);
        }
        inorder(root);
    }
}

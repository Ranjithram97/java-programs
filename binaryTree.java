public class binaryTree {
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
    public static class BinaryTree{
        static int idx=-1;
        public static Node buildtree(int[]node){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newnode=new Node(node[idx]);
            newnode.left=buildtree(node);
            newnode.right=buildtree(node);
            return newnode;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int[]arr={1,2,4,8,-1,-1,-1,5,9,-1,-1,-1,3,6,-1,-1,7,-1,10,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildtree(arr);
        System.out.println(root.data);
        System.out.println("Preorder Traversal:");
        preorder(root);
        System.out.println();
        System.out.println("Inorder Traversal:");
        inorder(root);
        System.out.println();
        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}

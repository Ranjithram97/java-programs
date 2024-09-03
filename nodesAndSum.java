public class nodesAndSum {
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
    public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        int lc=sum(root.left);
        int rc=sum(root.right);
        return lc+rc+root.data;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.left.left=new Node(7);
        root.right=new Node(3);
        root.right.right=new Node(6);
        System.out.println("No.of.Nodes Present in the tree is:"+count(root));
        System.out.println("Sum of all the Node Data is:"+sum(root));
    }
}

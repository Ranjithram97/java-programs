public class new1 {

        static int k=0;
        static class Node {
            int data;
            Node left;
            Node right;

            public Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }
        public static Node insert(Node root, int val)
        {
            if(root==null)
            {
                root=new Node(val);
                return root;
            }

            if(root.data>val)
            {
                root.left=insert(root.left,val);
            }
            else
            {
                root.right=insert(root.right,val);
            }
            return root;
        }

        public static void inorder(Node root)
        {
            if(root==null)
                return;
            System.out.println(root.data+" ");
            inorder(root.left);
            inorder(root.right);

        }


        public static void binarysearch(int[] arr, int low,
                                        int high,int[] newarr) {

            if(low<high) {
                int mid =  (low + high) / 2;
                newarr[k++] = arr[mid];
                binarysearch(arr, low, mid - 1,newarr);
                binarysearch(arr, mid + 1, high,newarr);
            }
            if (low == high) {
                newarr[k++]=arr[low];
            }

        }


        public static void main (String[]args){
            int arr[] = {3, 5, 6, 8, 10, 11, 12};
            Node root=null;
            int low = 0;
            int high = arr.length - 1;
            int newarr[]=new int[arr.length];
            binarysearch(arr, low, high,newarr);
            for(int i=0;i<newarr.length;i++)
            {
                root=insert(root,newarr[i]);
            }
            inorder(root);



        }
    }


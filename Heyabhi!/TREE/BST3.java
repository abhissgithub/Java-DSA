package TREE;

// Creating a BINARY SEARCH TREE

public class BST3 {
    public static class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

         public Node(int value) {
             this.value=value;
         }

         public int getValue(int value) {
             return value;

         }
     }
    public static Node root;

    public void BST3(){

    }
    public static void insert(int value){
        root=insert(value,root);
    }
    public static Node insert(int value, Node node) {
             if (node==null){
                 node=new Node(value);
                 return node;
             }
             if (value<node.value){
                 node.left=insert(value,node.left);
             }
             if (value> node.value){
                 node.right=insert(value,node.right);
             }
            node.height = Math.max(height(node.left), height(node.right)) + 1;
             return node;
         }

         public static int height(Node node){
        if (node==null){
            return -1;
        }
        return node.height;
    }


         public static void display() {
             display(root, "Root Node ");
         }
         public static void display(Node node,String details){
        if (node==null){
            return;

        }
        System.out.println(details+node.value);
        display(node.left,"Left child of " + node.value + ": ");
        display(node.right,"Right child of "+node.value+": ");

         }

         public static boolean isEmpty(){
        return root==null;

         }
         public static void populate(int[] arr){
        for (int i=0;i<arr.length;i++){
           insert(arr[i]);
        }
    }
         public static boolean balanced(){
        return balanced(root);
         }
    public static boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

         public static void main(String[] args) {
             int [] arr={10,5,13,16,8,4,14,15,6};
             populate(arr);
             display();
         }
}

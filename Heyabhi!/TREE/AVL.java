package TREE;

import javax.management.relation.RelationNotification;

public class AVL {
public class Node {
    int value;
    Node left;
    Node right;
    int height;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;

    }
    private static Node root;
    public void AVL () {

    }


    public boolean isEmpty(){
       return root==null;
       }
       public boolean balanced(){
        return balanced(root);
       }
       public boolean balanced(Node node){
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
       }
    public int Height() {
        return height(root);
    }

    public static int height(Node node){
        if (node==null) return -1;
        return node.height;
       }
    public void insert(int value) {
        root = insert(value, root);
    }
       public Node insert(int value,Node node){
        if (root==null){
            node=new Node(value);
            return node;
        }
        if (value<node.value){
            node.left=insert(value,node.left);
        }
        if (value>node.value){
            node.right=insert(value,node.right);
        }
        return rotated(node);
       }
       public Node rotated(Node node){
//        If left Heavy
        if (height(node.left)-height(node.right)>1){

//            //Left-Left Rotate
            if (height(node.left.left)-height(node.left.right)>1){
                return Rightrotate(node);
            }

//            Left-Right rotate
            if (height(node.left.left)-height(node.left.right)<0){
                node.left=Leftrotate(node.left);
                return Rightrotate(node);
            }

        }
               // If Right Heavy
           if (height(node.left)-height(node.right)<-1){

//            // Right-Right Rotate
               if (height(node.left.left)-height(node.left.right)<0){
                   return Leftrotate(node);
               }

//            Right-Left rotate
               if (height(node.left.left)-height(node.left.right)>0){
                   node.right=Rightrotate(node.right);
                   return Leftrotate(node);
               }
           }
           return node;

       }

    public Node Rightrotate(Node p) {
        Node c = p.left;
        Node t = c.right;
        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
       c.height=Math.max(height(c.left),height(c.right)+1);

        return c;
    }

    private Node Leftrotate(Node c) {
        Node p=c.right;
        Node t=p.left;
        p.left=c;
        c.right=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);

        return p;
    }
    private void display(){
        display(this.root,"Root Node: ");

    }
    public void display(Node node,String details){
        if (node==null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public void populated(int [] arr){
        for (int i=0;i<arr.length;i++){
            insert(arr[i]);
        }
    }
    public void populatedsorted(int [] nums){
        populatedsorted(nums,0,nums.length);
    }
    public void populatedsorted(int[]arr,int start,int end){

        if (start>=end){
            return;
        }
        int mid=(start+end)/2;
        populatedsorted(arr,start,mid);
        populatedsorted(arr,mid+1,end);

    }

    public static void main(String[] args) {

    }
}
}


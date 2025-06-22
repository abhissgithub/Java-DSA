package TREE;

class BST {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public void Node(int value) {
            this.value = value;
        }

        public int getvalue() {
            return value;

        }
    }
        private Node root;

        public BST() {

        }
        public boolean isEmpty(Node node){
            return node==null;
        }
        public void display(Node node){
            display(root," Root Node : ");
        }
        public int height(Node node){
            if (node==null){
                return -1;
            }
            return node.height;
        }
    private void display(Node node, String details) {
            if(node == null) {
                return;
            }
            System.out.println(details+node.getvalue());
            display(node.left,"Left child of node"+node.getvalue());
            display(node.right,"Right child of node"+node.getvalue());
            
    }
}



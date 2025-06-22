package TREE.QUESTIONS;

    class ISSYMMETRIC {
        public static boolean symmetric(TreeNode root){
            if(root==null){
                return true;
            }
            return mirror(root.left,root.right);
        }
        public static boolean mirror(TreeNode node1, TreeNode node2){
            if(node1==null && node2==null){
                return true;
            }
            if(node1==null || node2==null){
                return false;
            }

            return node1.val == node2.val && mirror(node1.left,node2.right) && mirror(node1.right,node2.left);
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);

            //After the creation of the root node the children to the root nodes are attached
            root.left = new TreeNode(2);
            root.right = new TreeNode(2);
            root.left.left=new TreeNode(3);
            root.left.right = new TreeNode(4);
            root.right.left = new TreeNode(4);
            root.right.left.right = new TreeNode(3);
            System.out.println(symmetric(root));

        }
        }

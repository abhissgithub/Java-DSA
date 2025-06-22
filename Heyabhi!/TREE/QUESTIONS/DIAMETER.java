package TREE.QUESTIONS;
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        class Solution {
            public static int diameterOfBinaryTree(TreeNode root) {
                dia(root);
                return d;
            }

            static int d = 0;

            public static int dia(TreeNode root) {
                if (root == null) {
                    return 0;
                }
                int left = dia(root.left);
                int right = dia(root.right);
                d = Math.max(d, left + right);
                return Math.max(left, right) + 1;
            }
            public void flat(TreeNode root){
                if (root==null){
                    return;
                }
            }

            public static void main(String[] args) {
                TreeNode root = new TreeNode(1);

                //After the creation of the root node the childs to the root nodes are attached
                root.left = new TreeNode(2);
                root.right = new TreeNode(5);
                root.left.right = new TreeNode(4);
                root.left.left = new TreeNode(3);
//        root.right.left = new TreeNode(n);
//        root.right.right = new TreeNode(5);
//        root.right.left.left = new TreeNode(247);
//        root.right.left.right = new TreeNode(448);
                int dia = diameterOfBinaryTree(root);
                System.out.println(dia);
            }
        }


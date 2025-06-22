package TREE.QUESTIONS;

public class ISCOUSINS {
    public static boolean IsCousins(TreeNode root,int x,int y){
        if (root==null){
            return false;
        }
        TreeNode XX=findnode(root,x);
        TreeNode YY=findnode(root,y);
        return (
             level(root.left,XX,0) == level(root.right,YY,0)  &&  (!siblings(root,XX,YY))
                );
    }
    public static TreeNode findnode(TreeNode node,int x){
        if (node==null){
            return null;
        }
        if (node.val==x){
            return node;
        }
        TreeNode n=findnode(node.left,x);
        if (n!=null){
            return n;
        }
        return findnode(node.right,x);

    }
    public static int level(TreeNode node,TreeNode x, int lev){
        if (node==null){
            return 0;
        }
        if (node==x){
            return lev;
        }
        int l=level(node.left,x,lev+1);
        if (l!=0){
            return l;
        }

        return level(node.right,x,lev+1);
    }
    public static boolean siblings(TreeNode node,TreeNode x,TreeNode y){
        if (node==null){
            return false;
        }
        return (
                (node.left==x && node.right==y)||(node.right==x&& node.left==y) || siblings(node.left,x,y) || siblings(node.right,x,y)
                );
    }

    public static void main(String[] args) {

    }

}

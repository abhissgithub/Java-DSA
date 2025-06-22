package TREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static class TreeNode {
        private int value;
        private int height;
        TreeNode left;
        TreeNode right;

        public void Node(int value) {

            this.value = value;
        }

        public int getvalue() {
            return value;

        }
    }

    public BFS() {

    }
    public List<List<Integer>> BFS(TreeNode root){
//        We Have to store answer in list of list, so we created it.
        List<List<Integer>> result=new ArrayList<>();

//        if root value is null then we return empty list
        if (root==null){
            return result;
        }

//        For BFS/Level Order traversal we have to traverse and just add the value,so we use queue #FIFO Approach
        Queue<TreeNode> q=new LinkedList<>();

//        We add root value first in queue
        q.offer(root);


        while (!q.isEmpty()){

//            Now at each level as we add value in list after that we have to add its left and right value in list for further traversal
//            So we created a variable of name level,and it's size will be the size of q
            int levelsize=q.size();

//            For Current level we created a list and in which we add currentNode value
            List<Integer>currentlevel =new ArrayList<>(levelsize);

            for (int i=0;i<levelsize;i++){

//                We traverse on level which is as q size and remove element from queue and add it in currrentlevel

                TreeNode currentNode=q.poll();
                currentlevel.add(currentNode.value);
                if (currentNode.left!=null){
                    q.offer(currentNode.left);
                }
                if (currentNode.right!=null){
                    q.offer(currentNode.right);
                }
            }
            result.add(currentlevel);

        }
        return result;

    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode();
    }
}

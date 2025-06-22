package TREE;

public class SEGMENTREES2 {
    public static class Node {
        int data;
        int StartInterval;
        int EndInterval;
        Node left;
        Node right;

        public Node(int StartInterval, int EndInterval) {
            this.StartInterval = StartInterval;
            this.EndInterval = EndInterval;

        }
    }

    Node root;

    public SEGMENTREES2(int[] arr) {
        this.root = CreateSegmentTree(arr, 0, arr.length - 1);
    }

    public Node CreateSegmentTree(int[] arr, int start, int end) {
        if (start == end) {
//            Leaf Node
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
//        Create new Node
        int mid = (start + end) / 2;
        Node node = new Node(start, end);
        node.left = CreateSegmentTree(arr, start, mid);
        node.right = CreateSegmentTree(arr, mid + 1, end);
        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display() {
        display(this.root);
    }

    public void display(Node node) {
        String str = "";
//        For Left Node
        if (node.left != null) {
            str = str + "Interval=[" + node.left.StartInterval + "-" + node.left.EndInterval + "] And data: " + node.left.data + " -->";
        } else {
            str=str +  "No left child";
        }
//        For Current Node
        str = str + "Interval [" + node.StartInterval + "-" + node.EndInterval + "] And data: " + node.data + " <--";

//        For Right Node
        if (node.right != null) {
            str = str + " Right Interval [" + node.right.StartInterval + "-" + node.right.EndInterval + "] And data: " + node.right.data + " -->";
        } else {
            str=str+ "No Right Child";
        }
        System.out.println(str + '\n');

        // call recursion
        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    public int query(Node node, int qsi, int qei) {
        if (node.StartInterval >= qsi && node.EndInterval <= qei) {
            return node.data;

        } else if (node.StartInterval > qei || node.EndInterval < qsi) {
            return 0;

        } else {
            return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {

        this.root.data = update(this.root, index, value);

    }

    private int update(Node node, int index, int value) {
        if (index >= node.StartInterval && index <= node.EndInterval) {
            if (index == node.StartInterval && index == node.EndInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}

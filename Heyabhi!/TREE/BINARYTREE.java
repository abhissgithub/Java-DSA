package TREE;

import java.util.Scanner;

public class BINARYTREE {
    public BINARYTREE() {
    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static Node root;

    public static void populate(Scanner scanner) {
        System.out.println("Enter the root value");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private static void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to add to the left of node " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value");
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to add to the right of node " + node.value);
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("enter the value");
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public static void display() {
        display(root, 0);
    }

    private static void display(Node node, int level) {
        if (node == null) {
            return;
        }
//        Go Towards right
        display(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.value);

        } else {
            System.out.println(node.value);
        }
//        Towards left
        display(node.left,level+1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      populate(scanner);
      display();
    }
}
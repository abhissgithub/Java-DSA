package TREE;

public class SEGMENTMAIN {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SEGMENTREES2 tree = new SEGMENTREES2(arr);
         tree.display();
        System.out.print("Sum of range is : ");
        System.out.print(tree.query(1, 6));
    }
}


package LINKEDLIST;

public class SINGLYLINKEDLIST {
    static class LL {
        private Node head;

        public Node tail;

        public int size;

        public LL() {
            this.size = 0;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;

            }
            System.out.println("End");
        }

        //        INSERT FIRST
        public void Insertfirst(int val) {
            Node node = new Node(val);
            node.next = head;
            head = node;
            if (tail == null) {
                tail = head;

            }
            size += 1;


        }

        private static class Node {
            private int val;
            private Node next;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next) {
                this.val = val;
                this.next = next;
            }
        }
    }






    }

package QUEUE;
    class Queue {
        int arr[];
        static int size;
        int rear = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // dequeue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(2);
        q.add(4);
        q.add(6);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

class LinearQueueDemo {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;

    static void enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    static void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[front++]);
        }
    }

    static void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println(" in queue");
        }
    }

    public static void main(String[] args) {
        // Already given values
        enqueue(10);
        enqueue(20);
        enqueue(30);

        display();   // 10 20 30

        dequeue();   // removes 10
        display();   // 20 30
    }
}

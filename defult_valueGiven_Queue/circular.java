class CircularQueueDemo {
    static int[] queue = new int[5];
    static int front = -1, rear = -1;
    static int size = queue.length;

    static void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            queue[rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    static void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[front]);
            if (front == rear)
                front = rear = -1;
            else
                front = (front + 1) % size;
        }
    }

    static void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
        } else {
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear)
                    break;
                i = (i + 1) % size;
            }
            System.out.println("in queue");
        }
    }

    public static void main(String[] args) {
        // defult values
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        display();    // 10 20 30 40

        dequeue();    // removes 10
        dequeue();    // removes 20

        display();    // 30 40

        enqueue(50);
        enqueue(60);  // fills the queue

        display();    //displays value
    }   
}

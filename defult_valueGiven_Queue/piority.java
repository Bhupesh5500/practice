class PriorityQueueDemo {
    static int[] queue = new int[5];
    static int size = queue.length;
    static int count = 0;

    static void enqueue(int x) {
        if (count == size) {
            System.out.println("Queue Overflow");
            return;
        }

        int i;
        for (i = count - 1; i >= 0 && queue[i] < x; i--) {
            queue[i + 1] = queue[i];
        }
        queue[i + 1] = x;
        count++;
        System.out.println("Inserted " + x);
    }

    static void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[0]);
            for (int i = 0; i < count - 1; i++)
                queue[i] = queue[i + 1];
            count--;
        }
    }

    static void display() {
        if (count == 0) {
            System.out.println("Queue Empty");
        } else {
            for (int i = 0; i < count; i++)
                System.out.print(queue[i] + " ");
            System.out.println("in priority queue");
        }
    }

    public static void main(String[] args) {
        // defult values 
        enqueue(30);
        enqueue(10);
        enqueue(50);
        enqueue(20);

        display();   // 50 30 20 10

        dequeue();   // removes highest priority (50)
        display();   // 30 20 10
    }
}

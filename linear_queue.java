import java.util.Scanner;

class LinearQueue {
    int[] queue;
    int front = -1, rear = -1, size;

    LinearQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[front++]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
        } else {
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearQueue q = new LinearQueue(5);

        while (true) {
            System.out.println("1.Enqueue 2.Dequeue 3.Display 4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> q.enqueue(sc.nextInt());
                case 2 -> q.dequeue();
                case 3 -> q.display();
                case 4 -> System.exit(0);
            }
        }
    }
}

import java.util.Scanner;

class CircularQueue {
    int[] queue;
    int front = -1, rear = -1, size;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int x) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            rear = (rear + 1) % size;
            queue[rear] = x;
            System.out.println("Inserted " + x);
        }
    }

    void dequeue() {
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

    void display() {
        if (front == -1) {
            System.out.println("Queue Empty");
        } else {
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue(5);

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

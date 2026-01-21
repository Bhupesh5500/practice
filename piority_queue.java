import java.util.Scanner;

class PriorityQueue {
    int[] queue;
    int size, count = 0;

    PriorityQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int x) {
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

    void dequeue() {
        if (count == 0) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[0]);
            for (int i = 0; i < count - 1; i++)
                queue[i] = queue[i + 1];
            count--;
        }
    }

    void display() {
        if (count == 0) {
            System.out.println("Queue Empty");
        } else {
            for (int i = 0; i < count; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue q = new PriorityQueue(5);

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

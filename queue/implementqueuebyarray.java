package queue;

class myqueue {
    int[] arr;
    int size;
    int f;
    int r;

    myqueue(int len) {
        arr = new int[len];   // yaha int[] dobara nahi likhna
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("queue is full");
            return;
        }

        arr[r] = val;
        r++;

        if (r == arr.length) {
            r = 0;
        }

        size++;
    }

    int remove() {
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        }

        int front = arr[f];
        f++;

        if (f == arr.length) {
            f = 0;
        }

        size--;

        return front;
    }

    int peek() {
        if (size == 0) {
            System.out.println("queue is empty");
            return -1;
        }

        return arr[f];
    }

    void display() {
        if (size == 0) {
            System.out.println("queue is empty");
            return;
        }

        int index = f;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[index] + " ");
            index++;

            if (index == arr.length) {
                index = 0;
            }
        }

        System.out.println();
    }
}

public class implementqueuebyarray {

    public static void main(String[] args) {

        myqueue q = new myqueue(5);

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        q.display();

        System.out.println("Removed: " + q.remove());

        System.out.println("Peek: " + q.peek());

        q.display();
    }
}
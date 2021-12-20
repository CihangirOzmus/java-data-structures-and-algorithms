package linearDataStructures.queue;

public class CustomQueueApp {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        q.enqueue(3);
        q.enqueue(5);

        if (!q.isEmpty()) {
            System.out.println(q.front());
        }

        q.dequeue();

        if (!q.isEmpty()) {
            System.out.println(q.front());
        }

    }
}

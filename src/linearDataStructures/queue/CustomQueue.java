package linearDataStructures.queue;

import java.util.ArrayList;
import java.util.List;

public class CustomQueue {
    private final List<Integer> data;
    private int q_start;

    public CustomQueue() {
        this.data = new ArrayList<>();
        this.q_start = 0;
    }

    public boolean enqueue(int val) {
        data.add(val);
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) return false;
        q_start++;
        return true;
    }

    public boolean isEmpty() {
        return q_start >= data.size();
    }

    public int front() {
        return data.get(q_start);
    }
}

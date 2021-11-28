package linearDataStructures.hashset;

import java.util.LinkedList;

public class CustomHashSet {
    private final Bucket[] bucketArray;
    private final int keyRange;

    public CustomHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for (int i = 0; i < this.keyRange; i++) {
            this.bucketArray[i] = new Bucket();
        }
    }

    private int hash(int key) {
        return key % this.keyRange;
    }

    public void add(int key) {
        int bucketIndex = this.hash(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.hash(key);
        this.bucketArray[bucketIndex].delete(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.hash(key);
        return this.bucketArray[bucketIndex].exists(key);
    }

    private class Bucket {
        private final LinkedList<Integer> container;

        public Bucket() {
            this.container = new LinkedList<>();
        }

        public void insert(int key) {
            int index = this.container.indexOf(key);
            if (index == -1) {
                this.container.addFirst(key);
            }
        }

        public void delete(int key) {
            this.container.remove(key);
        }

        public boolean exists(int key) {
            int index = this.container.indexOf(key);
            return index != -1;
        }
    }

}

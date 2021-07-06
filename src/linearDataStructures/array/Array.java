package linearDataStructures.array;

import java.util.ArrayList;

public class Array {
    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }

        System.out.println();
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems;
        }

        items[count++] = item;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++)
            if (items[i] == item) return i;

        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }

        count--;
    }

    public int[] intersect(int[] anotherItems){
        ArrayList<Integer> result = new ArrayList<>();
        int m = count;
        int n = anotherItems.length;

        int i = 0, j = 0;
        while (i < m && j < n){
            if (items[i] > anotherItems[j]){
                j++;
            } else if (items[i] < anotherItems[j]){
                i++;
            } else {
                result.add(items[i]);
                i++; j++;
            }
        }

        return result.stream().mapToInt(k -> k).toArray();
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (items[i] > max) max = items[i];
        }
        return max;
    }

    public boolean contains(int item) {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void reverse() {
        int temp;
        for (int i = 0; i < count / 2; i++) {
            temp = items[i];
            items[i] = items[count - i - 1];
            items[count - i - 1] = temp;
        }
    }

    public void insertAt(int item, int index) {
        int[] newArray = new int[count + 1];
        for (int i = 0; i < count + 1; i++) {
            if (i < index){
                newArray[i] = items[i];
            } else if (i == index){
                newArray[i] = item;
            } else
                newArray[i] = items[i - 1];
        }
        count++;
        items = newArray;
    }
}

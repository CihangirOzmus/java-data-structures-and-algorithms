package linearDataStructures.linkedlist;

import java.util.Arrays;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list.indexOf(10));
        System.out.println(list.contains(50));
        System.out.println(list.size());
        list.reverse();
        var array = list.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println(list.getKthFromTheEnd(1));
    }
}

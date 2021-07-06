package linearDataStructures.array;

import java.util.Arrays;

public class ArrayApp {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();
        numbers.removeAt(3);
        numbers.print();
        System.out.println("Index: " + numbers.indexOf(30));
        System.out.println("Max number: " + numbers.max());
        numbers.print();
        System.out.println(Arrays.toString(numbers.intersect(new int[]{10, 20, 30,  40, 50})));
        numbers.reverse();
        numbers.print();
        numbers.insertAt(40, 1);
        numbers.print();
    }
}

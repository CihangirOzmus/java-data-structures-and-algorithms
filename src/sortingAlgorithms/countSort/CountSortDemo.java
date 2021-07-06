package sortingAlgorithms.countSort;

import java.util.Arrays;

public class CountSortDemo {
    public static void main(String[] args) {
        int[] numbers = {1 , 7 , 3, 4 ,2, 6, 3};
        var sorter = new CountSort();
        sorter.sort(numbers, 7);
        System.out.println(Arrays.toString(numbers));
    }
}

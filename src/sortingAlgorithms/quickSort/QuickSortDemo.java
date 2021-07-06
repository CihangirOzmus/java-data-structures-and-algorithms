package sortingAlgorithms.quickSort;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] numbers = {7 , 3 , 1, 5 ,2, 2, 8, 4, 9};
        var sorter = new QuickSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

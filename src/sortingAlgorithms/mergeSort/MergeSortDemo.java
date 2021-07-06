package sortingAlgorithms.mergeSort;

import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] numbers = {1 , 7 , 3, 4 ,2, 6, 3};
        var sorter = new MergeSort();
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

package sortingAlgorithms.bubbleSort;

public class BubbleSort {
    public void sort(int[] array) {
        if (array.length == 0) {
            return;
        }

        boolean isSorted = false;
        int counter = 0;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1 - counter; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, i + 1, array);
                    isSorted = false;
                }
            }
            counter++;
        }
    }

    private void swap(int index1, int index2, int[] array) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

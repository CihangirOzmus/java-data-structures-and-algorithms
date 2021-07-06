package searchingAlgorithms;

public class Search {
    public int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target)
                return i;

        return -1;
    }

    public int binarySearchWithRecursive(int[] array, int target) {
        return binarySearchWithRecursive(array, target, 0, array.length - 1);
    }

    private int binarySearchWithRecursive(int[] array, int target, int left, int right) {
        if (right < left)
            return -1;

        int middle = (left + right) / 2;

        if (array[middle] == target)
            return middle;

        if (target < array[middle])
            return binarySearchWithRecursive(array, target, left, middle - 1);
        else
            return binarySearchWithRecursive(array, target, middle + 1, right);
    }

    public int binarySearchWithIterative(int[] array, int target){
        var left = 0;
        var right = array.length - 1;

        while (left <= right){
            var middle = (left + right) / 2;

            if (array[middle] == target)
                return middle;

            if (target < array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return -1;
    }
}

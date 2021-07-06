package searchingAlgorithms;

public class SearchDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7};
        var search = new Search();
        var index = search.binarySearchWithIterative(numbers, 7);
        System.out.println(index);
    }
}

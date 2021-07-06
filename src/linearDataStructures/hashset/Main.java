package linearDataStructures.hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 2, 1, 4};
        removeDuplicateNumbers(numbers);

        String str = "a green apple";
        System.out.println(findFirstRepeatedChar(str));
    }

    public static void removeDuplicateNumbers(int[] numbers){
        Set<Integer> set = new HashSet<>();
        for (var number: numbers)
            set.add(number);
        System.out.println(set);
    }

    public static char findFirstRepeatedChar(String str){
        Set<Character> set = new HashSet<>();
        for (var ch: str.toCharArray()){
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }
}

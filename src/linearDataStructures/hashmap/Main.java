package linearDataStructures.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(findFirstNonRepeatedChar("a green apple"));
    }

    public static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        for (var ch: chars)
            if (map.get(ch) == 1)
                return ch;

        return Character.MIN_VALUE;
    }
}

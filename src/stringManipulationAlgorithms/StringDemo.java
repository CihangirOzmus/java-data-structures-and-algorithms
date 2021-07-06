package stringManipulationAlgorithms;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(StringUtils.countVowels("Hello Vowels"));
        System.out.println(StringUtils.reverse("blue"));
        System.out.println(StringUtils.areRotations("ABCD", "DABC"));
        System.out.println(StringUtils.removeDuplicates("Trees are beautiful"));
        System.out.println(StringUtils.getMaxOccuringChar("Hello"));
        System.out.println(StringUtils.capitalize("today    is a great    day"));
        System.out.println(StringUtils.areAnagrams("ABCD", "CDBA"));
        System.out.println(StringUtils.isPalindrome("ABBA"));
    }
}

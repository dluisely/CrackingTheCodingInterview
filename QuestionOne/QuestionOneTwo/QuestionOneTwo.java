import java.util.*;
/**
 * Permutation: Given two strings, write a method to decide if one is a permutation of the other
 *
 * @author Luisely Doza
 * @version 12/04/21
 */
public class QuestionOneTwo {
    public boolean isPermutation(String s1, String s2) {
        //another string that contains same characters, only the order of characters can be different
        boolean isPermutation;
        Map<Character, Boolean> map = new HashMap<Character, Boolean>();
        for(int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), false);
        }
        for(int i = 0; i < s2.length(); i++) {
            if(s2.length() > s1.length() || s1.length() > s2.length()) {
                isPermutation = false;
                return isPermutation;
            }
            if(map.containsKey(s2.charAt(i))) {
                map.put(s2.charAt(i), true);
            }
        }
        if(map.containsValue(false)) {
            isPermutation = false;
            return isPermutation;
        } else {
            isPermutation = true;
            return isPermutation;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input two strings:");
        String s1 = scan.next();
        String s2 = scan.next();
        QuestionOneTwo q1 = new QuestionOneTwo();
        System.out.printf("String 1: \"%s\" and String 2: \"%s\" are permutations of each other: %b", s1, s2, q1.isPermutation(s1,s2));
    }
}

import java.util.Arrays;
import java.util.Scanner;
/**
 * URLify: Write a method to replace all spaces in a string with
 * '%20'. You may assume that the string has sufficient space
 * at the end to hold the additional characters, and that you are
 * given the "true" length of the string. (Note: If implementing in Java,
 * please use a character array so that you can perform this operation in place.)
 * 
 * EXAMPLE:
 * 
 * Input: "Mr John Smith     ", 13
 * Output: "Mr%20John%20Smith"
 *
 * @author Luisely Doza
 * @version 12/04/21
 */
public class QuestionOneThree {
    public QuestionOneThree(String input) {
        char[] output = URLify(input);
        String s = new String(output);
        System.out.printf("Output: %s", s);
    }
    public char[] URLify(String s) {
        int length = s.length();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                length += 2;
            }
        }
        
        char[] c = new char[length];
        int j = 0;
        for(int i = 0; i < c.length; i++) {
            if(s.charAt(j) == ' ') {
                c[i] = '%';
                c[i+1] = '2';
                c[i+2] = '0';
                i+=2;
                j++;
            } else {
                c[i] = s.charAt(j);
                j++;
            }
        }    
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scan.nextLine();
        QuestionOneThree q1 = new QuestionOneThree(input);
    }
}

import java.util.Scanner;
/**
 * Is Unique: Implement an algorithm to determine if a string 
 * has all unique characters. What if you cannot use additional
 * data structures
 *
 * @author Luisely Doza
 * @version 12/03/21
 */
public class QuestionOneOne {
    public QuestionOneOne(String s) {
        System.out.println("Does " + s + " have all unique characters?");
        System.out.println(unique(s));
    }
    public boolean unique(String s) {
        s = s.toLowerCase();  //capitialization and lowercase are insignificant
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); //s
            int j = i + 1;
            while(j < s.length()) {
                if(s.charAt(j) != c) {
                    j++;
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scan.next();
        QuestionOneOne q1 = new QuestionOneOne(s);
    }
}

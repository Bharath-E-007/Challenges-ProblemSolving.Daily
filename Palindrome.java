import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int count = 0;
        if (ispalindrome(str))
            count++;
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isAlphabetic(c))
                s1.append(c);
            else
                s2.append(c);
        }
        if (ispalindrome(s1.toString()))
            count++;
        if (ispalindrome(s2.toString()))
            count++;
        System.out.println(
                (count == 0 ? "No" : count == 1 ? "Single" : count == 2 ? "Double" : "Triple") + " Palindrome");
    }

    public static boolean ispalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
/*
 * check a given String is Plaindrome or not it check full String and alphabetic
 * in the String and Digit in
 * String is Palindrome or not;
 */
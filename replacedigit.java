import java.util.*;

public class replacedigit {
    public static void main(String[] args) {
        String n = new Scanner(System.in).nextLine();

        for (int i = 1; i < n.length(); i++) {
            String s1 = n.substring(0, i);
            for (int j = 0; j < 10; j++) {
                int n1 = Integer.parseInt(s1 + String.valueOf(j) + n.substring(i + 1));

                if (isprime(n1)) {
                    System.out.println("NO");
                    System.exit(0);

                }
            }

        }
        System.out.println("YES");
    }

    public static boolean isprime(int val) {
        if (val <= 1)
            return false;
        int i = 2;
        while (i * i <= val) {
            if (val % i == 0)
                return false;
        }
        return true;
    }
}
/*
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * 200
 * 
 * Output:
 * 
 * YES
 * 
 * Explanation:
 * 
 * Here N = 200.
 * 
 * All possible integers that can be formed by replacing exactly one digit in
 * 200 are given below.
 * 
 * Replacing 1st digit -> 0, 100, 300, 400, 500, 600, 700, 800, 900
 * 
 * Replacing 2nd digit -> 210, 220, 230, 240, 250, 260, 270, 280, 290
 * 
 * Replacing 3rd digit -> 201, 202, 203, 204, 205, 206, 207, 208, 209
 * 
 * It is not possible to form a prime integer from the given integer 200.
 * 
 * So YES is printed as the output.
 * 
 * Example Input/Output 2:
 * 
 * Input:
 * 
 * 14
 * 
 * Output:
 * 
 * NO
 * 
 * Explanation:
 * 
 * Here N = 14.
 * 
 * All possible integers that can be formed by replacing exactly one digit in 14
 * are given below.
 * 
 * Replacing 1st digit -> 4, 24, 34, 44, 54, 64, 74, 84, 94
 * 
 * Replacing 2nd digit -> 10, 11, 12, 13, 15, 16, 17, 18, 19
 * 
 * The integers 11, 13, 17 and 19 are prime numbers.
 * 
 * So NO is printed as the output.
 */

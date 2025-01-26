import java.util.*;

public class factorof1andlastdigit {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();
        int i = 1;
        while (true) {
            int p = num - i, c = num + i;
            if (p % (getFirst(p) * 10 + (p % 10)) == 0) {
                System.out.println(p);
                break;
            }
            if (c % (getFirst(c) * 10 + (c % 10)) == 0) {
                System.out.println(c);
                break;
            }
            i++;
        }
    }

    public static int getFirst(int n) {
        return Character.getNumericValue(String.valueOf(n).charAt(0));

    }
}
/*
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * 103
 * 
 * Output:
 * 
 * 105
 * 
 * Explanation:
 * 
 * The nearest possible integer is 105.
 * 
 * The concatenation of the first digit and
 * 
 * the last digit in 105 is 15.
 * 
 * 15 is a factor of 105.
 * 
 * So 105 is printed as the output.
 * 
 * Example Input/Output 2:
 * 
 * Input:
 * 
 * 241
 * 
 * Output: 240
 * 
 * Example Input/Output 3:
 * 
 * Input: 341
 * 
 * Output: 341
 */

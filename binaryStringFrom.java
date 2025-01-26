import java.util.*;

public class binaryStringFrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(), bin = sc.nextLine();

        for (char ch : bin.toCharArray()) {

            int c = (int) ch;

            String binary = (String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));

            for (int i = 0; i < 8; i++) {
                System.out.print(binary.charAt(i) == '0' ? Character.toLowerCase(str.charAt(i))
                        : Character.toUpperCase(str.charAt(i)));

            }
            System.out.print(" ");
        }

    }

}
/*
 * Output Format:
 * 
 * The first line contains the string values obtained separated by a space.
 * 
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * universe
 * 
 * Hello
 * 
 * Output:
 * 
 * uNivErse uNiveRsE UNIvERse uNIvERse UNIVERSE
 * 
 * Explanation:
 * 
 * S1 = universe S2 = Hello
 * 
 * ASCII value of H = 72 -> 01001000 -> uNivErse
 * 
 * ASCII value of e = 101 -> 01100101 -> uNiveRsE
 * 
 * ASCII value of 1 = 108 -> 01101100 -> uNIvERse
 * 
 * ASCII value of I = 108 -> 01101100 -> uNIvERse
 * 
 * ASCII value of o = 111 -> 01101111 -> UNIVERSE
 * 
 * Example Input/Output 2:
 * 
 * Input:
 * 
 * goodluck 123#5
 * 
 * Output:
 * 
 * goodluck goODluCk goODluCK goodluCK goODIUCK
 */

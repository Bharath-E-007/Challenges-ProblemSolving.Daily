import java.util.*;

public class Stringform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        while (sc.hasNext()) {
            String s = sc.next();
            s1 = s1 + " " + s;
        }
        String str[] = s1.split(" ");
        StringBuilder sb = new StringBuilder();
        int val = -1;
        for (int i = 0; i < str[0].length(); i++) {
            while (true) {

                val = i % 2 == 0 ? val + 1 : val - 1;
                if (val == -1 || val == str.length)
                    break;
                if (str[val].charAt(i) != '-')
                    sb.append(str[val].charAt(i));

            }
        }
        System.out.println(sb);
        System.exit(0);
    }
}
/*
 * Input Format:
 * 
 * The lines, each contains the characters.
 * 
 * Output Format:
 * 
 * The first line contains S.
 * 
 * Example Input/Output 1:
 * 
 * Input:
 * 
 * sckms
 * kapa-
 * irrr-
 * Ilog-
 * Output:
 *
 * skillrackprograms
 * 
 * Explanation:
 * 
 * There are 4 rows in the given matrix, so the value of R = 4.
 * 
 * There are 5 columns in the given matrix, so the value of C = 5.
 * The characters present in the vertical zig-zag fashion are given below.
 * skillrackprograms---
 * The orginal value of S is
 * skillrackprograms,
 * which is printed as the output.
 * 
 * Example Input/Output 2:
 * 
 * Input:
 * ChBe-r
 * aco-Pe
 * nr-e-
 * do-tnp
 * Itoop-
 * e-kna-
 * Output:
 * CandletorchBooknote Penpaper
 */
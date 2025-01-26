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

        return Character

                .getNumericValue(String.valueOf(n).charAt(0));

    }

}

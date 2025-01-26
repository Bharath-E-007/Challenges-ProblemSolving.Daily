import java.util.*;

public class replacedigit {
    public static void main(String[] args) {
        String n = new Scanner(System.in).nextLine();

        for (int i = 0; i < n.length(); i++) {
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
        int i = 2;
        while (i * i <= val) {
            if (val % i == 0)
                return false;

        }

        return true;
    }
}

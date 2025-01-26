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

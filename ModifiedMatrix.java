import java.util.*;

public class ModifiedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();

        int mat[][] = new int[r][c];

        for (int i = 0; i < r; i++)

            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();

        int k = sc.nextInt();

        char ch[][] = new char[r / k][c / k];

        char alpha = 'a';
        for (int i = (r / k) - 1; i >= 0; i--) {
            int j = 0, i1 = i;
            while (j < c / k && i1 < r / k) {
                ch[i1][j] = alpha++;
                j++;
                i1++;
                if (alpha > 'z')
                    alpha = 'a';
            }

        }

        for (int i = 1; i < c / k; i++) {

            int j = 0, i1 = i;
            while (j < r / k && i1 < c / k) {
                ch[j][i1] = alpha++;
                j++;
                i1++;
                if (alpha > 'z')
                    alpha = 'a';
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                char char1 = ch[i / (r / k)][j / (c / k)];
                System.out.print((mat[i][j] == 0 ? Character.toLowerCase(char1) : Character.toUpperCase(char1)) + " ");
            }
        }
        System.out.println();
    }
}
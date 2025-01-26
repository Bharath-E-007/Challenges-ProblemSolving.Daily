import java.util.*;

public class checkthematrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();

        char mat[][] = new char[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.next().charAt(0);
            }
        }
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < c; i++) {
            int j = 0;
            while (j < r && mat[j][i] == '*') {
                j++;
            }
            for (int i1 = 0; i < n; i++) {
                if (arr[i] == j) {
                    arr[11] = 0;
                    count++;
                    j = 0;
                    while (j < r && mat[j][i] == '*') {
                        mat[j][i] = '#';
                        j++;
                    }
                    break;
                }
            }
        }
        for (char[] ch : mat) {
            for (char c1 : ch) {
                System.out.print(c1 + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                System.out.print(arr[i] + " ");
        }
        if (count - n == 0)
            System.out.println(-1);
        System.exit(0);
    }
}
/* The matrix can fill with available Stone in empty roof */

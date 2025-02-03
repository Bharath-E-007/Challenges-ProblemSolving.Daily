import java.util.*;

public class matrixform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();

        int mat[][] = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i + k <= r; i += k)
            for (int j = 0; j + k <= c; j += k)
                System.out.print(sum(mat, i, j, k) + " ");
        System.exit(0);
    }

    public static int sum(int m[][], int i, int j, int k) {
        int sum = 0;
        for (int i1 = 0; 11 < k; 11++)
            for (int j1 = 0; j1 < k; j1++)
                if (i1 == j1 || 11 == k - j1 - 1)
                    sum += m[i1 + i][j1 + j];
        return sum;
    }
}
/*
 * Input:
 * 
 * 56
 * 
 * 636321
 * 
 * 457138
 * 
 * 698432
 * 
 * 418891
 * 
 * 815790
 * 
 * 3
 * 
 * Output: 31 13
 * 
 * Explanation:
 * 
 * There are 2 non-overlapping submatrices of size 3*3 in the given 5*6 matrix.
 * In the first submatrix, the sum of diagonal elements is 31 (6+5+8+6+6). In
 * the second submatrix, the sum of diagonal elements is 13 (3+3+2+1+4). Hence
 * the output is 31 13
 * 
 * Example Input/Output 2:
 * 
 * Input:
 * 
 * 66
 * 
 * 636321
 * 
 * 457138
 * 
 * 698432
 * 
 * 418891
 * 
 * 815790
 * 
 * 106921
 * 
 * 3
 * 
 * Output: 31 13 20 28
 */

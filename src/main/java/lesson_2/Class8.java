package lesson_2;

import java.util.Arrays;

public class Class8 {
    public static void main(String[] args) {
        diag(6, 6);
    }

    public static void diag(int a, int b) {
        int[][] A = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == j) {
                    A[i][j] = 1;
                } else if (i == (a - 1) - j) {
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(A[i]));
        }
    }
}

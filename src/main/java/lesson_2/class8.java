package lesson_2;

public class class8 {
    public static void main(String[] args) {
                diag();
    }
        public static void diag() {
        int[][] A = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    A[i][j] = 1;
                }
                else if (i == 3 - j) {
                    A[i][j] = 1;
                }
                else {
                    A[i][j] = 0;
                }
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

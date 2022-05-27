package lesson_2;

import java.util.Arrays;

public class class9 {
    public static void main(String[] args) {
        pub(4, 8);
    }

    public static void pub(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}

package lesson_2;

import java.util.Arrays;

public class Class5 {
        public static void main(String[] args) {
        massive();
    }
    public static void massive () {
        int[] arr = new int[]{1,1,0,0,1,0,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}


package lesson_5;

import java.util.Arrays;

public class Method {
    static void swap(String[] array, int firstIndex, int secondIndex) {
        String temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] array = new String[4];
        array[0] = "Summer";
        array[1] = "Autumn";
        array[2] = "Winter";
        array[3] = "Spring";
        System.out.println(Arrays.toString(array));
        swap(array, 0, 1);
    }
}


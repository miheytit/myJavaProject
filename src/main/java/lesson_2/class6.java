package lesson_2;

public class class6 {
    public static void main(String[] args) {
        massive();
    }
    public static void massive() {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++){
            arr[i]= i+1;}
        System.out.println(arr[99]);
    }
}


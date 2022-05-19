package lesson1;

public class MainClass {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void checkSumSign() {
        int a =  -3, b = 1;
        System.out.println(a + b);
        if ((a + b)>=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 3;
        if(value<=0){
            System.out.println("Красный");
        } else if (value>0 && value<=100) {
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
       int a = 3;
       int b = 5;
       if(a>=b){
           System.out.println("a >= b");
       } else {
           System.out.println("a < b");
       }

    }
}



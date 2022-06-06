package lesson_6;

public class Main {
    public static void main(String[] args) throws MyArraySizeException,MyArrayDataException{

        String[][] Arr = {{"4", "6", "3", "8"},{"2", "7", "2", "5"}, {"1", "4", "8", "3"}, {"3", "5", "4", "9"}};

        try {
            System.out.println("Сумма всех элементов массива равна " + Method.strMethod(Arr) + ".\n");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package lesson_8;

public class Main {
    public static void main(String[] args){

        Phonebook phonebook = new Phonebook();

        System.out.println("Заполняем справочник");
        phonebook.add("Курочкин", "+375293257896");
        phonebook.add("Курочкин", "+375295632722");
        phonebook.add("Дятлов", "+1375293657459");
        phonebook.add("Казладоев", "+375294444444");
        phonebook.add("Курочкин", "+3752958743255");
        System.out.println();

        System.out.println("В результате:");
        System.out.println("Курочкин");
        System.out.println(phonebook.get("Курочкин"));
        System.out.println("Дятлов");
        System.out.println(phonebook.get("Дятлов"));
        System.out.println("Казладоев");
        System.out.println(phonebook.get("Казладоев"));
        System.out.println();

        System.out.println("Отсутствие записи:");
        System.out.println("Мерзликин");
        System.out.println(phonebook.get("Мерзликин"));
        System.out.println();

        System.out.println("Попытка записи существующего номера");
        phonebook.add("Курочкин", "+375293257896");
        System.out.println("Курочкин");
        System.out.println(phonebook.get("Курочкин"));
    }

}

package lesson_4_Plate;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(int n) {
        food += n;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else System.out.println("Мало еды");
        return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}

class Cat {
    private String name;
    int appetite;
    boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) this.satiety = true;
        else this.satiety = false;
    }

    public void satietyInfo() {
        System.out.println("Кот " + name + " " + (satiety ? "сыт" : "голоден"));
    }
}

class MainClass {
    public static void main(String[] args) {
        Cat[] c = new Cat[3];
        c[0] = new Cat("Stinger", 10, false);
        c[1] = new Cat("Pushok", 5, false);
        c[2] = new Cat("Vasya", 20, false);
        Plate plate = new Plate(10);
        plate.info();
        for (int i = 0; i < c.length; i++)
            c[i].eat(plate);
        plate.info();
        for (int i = 0; i < c.length; i++) {
            c[i].satietyInfo();
        }
    }
}

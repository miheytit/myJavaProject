package lesson_4;

public class Animal {
    private String name;
    private int run, swim;

    Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    void running() {
        System.out.println(name + " пробежал " + run + " метров");
    }

    void swimming() {
        System.out.println(name + " проплыл " + swim + " метров");
    }

    String getName() {
        return name;
    }

    int getRun() {
        return run;
    }

    int getSwim() {
        return swim;
    }
}

class Cat extends Animal {
    Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public static void main(String args[]) {
        Cat Vasya = new Cat("Кот Вася", 150, 2);
        if (Vasya.getRun() > 200) System.out.println(Vasya.getName() + " дальше нельзя бежать");
        else Vasya.running();
        if (Vasya.getSwim() > 0) System.out.println(Vasya.getName() + " кот не умеет плавать");
        else Vasya.swimming();
    }
}

class Dog extends Animal {
    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public static void main(String args[]) {
        Dog pup = new Dog("Пес Бобик", 250, 15);
        if (pup.getRun() > 500) System.out.println(pup.getName() + " дальше нельзя, там кошка");
        else pup.running();
        if (pup.getSwim() > 10)
            System.out.println(pup.getName() + " после 10 метров устал");
        else pup.swimming();
    }
}

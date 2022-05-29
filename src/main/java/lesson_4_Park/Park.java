package lesson_4_Park;

public class Park {
    private String attraction;
    private double timeStart;
    private double timeFinish;
    private double cost;

    Park(String attraction, double timeStart, double timeFinish, double cost) {
        this.attraction = attraction;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.cost = cost;
    }
}

class Save {
    public static void main(String[] args) {
        Park[] a = new Park[3];
        a[0] = new Park("Горки", 10.00, 20.00, 30);
        a[1] = new Park("Колесо", 11, 20, 40);
        a[2] = new Park("Качельки", 9, 11, 100);
    }
}


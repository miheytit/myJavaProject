package lesson_3;

public class massif {
    public static void main(String[] arg){
        Employees[] Employee = new Employees[5];
        Employee[0] = new Employees("Sharay","Vlad","Vladovich","Director","sharay@gmail.com","+37533531476",1500,58);
        Employee[1] = new Employees("Petrov", "Petr", "Petrovich","secretary", "Petrov@mail.ru","+375292145687", 570, 40);
        Employee[2] = new Employees("Nikolaev", "Nikola", "Nikolaevich", "Tech director", "nnn@rambler.ru","+375293214785", 2000, 42);
        Employee[3] = new Employees("Voronov", "Egor", "Petrovich", "sale manager", "voron@gmail.com", "+375291475246", 760, 38);
        Employee[4] = new Employees("Vigor", "Olga", "Fedorovna", "cleaner","vigor@mail.ru", "+3752936418756", 350, 41);
        // вывод информации о сотрудниках старше 40 лет
        for (int i = 0; i<Employee.length; i++) {
            if (Employee[i].getAge() > 40) {
                System.out.println("Старше 40 лет " + Employee[i].display());
            }
        }
        System.out.println();
        // вывод информации об объектах
        for (int i = 0; i<Employee.length; i++) {
            Employee[i].printInfo();}
    }
}

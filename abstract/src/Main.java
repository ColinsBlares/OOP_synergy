abstract class Worker {
    protected String name;
    protected String profession;
    protected double salary;
    public Worker(String name, String profession, double salary) {
        this.name = name;
        this.profession = profession;
        this.salary = salary;
    }
    public abstract void myOccupation();
}

class Engineer extends Worker {
    public Engineer(String name, double salary) {
        super(name, "Инженер", salary);
    }

    // Переопределение абстрактного метода родителя
    @Override
    public void myOccupation() {
        System.out.println("Я инженер.");
    }
}

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Иван", 50000.0);

        System.out.println("Имя: " + engineer.name);
        System.out.println("Профессия: " + engineer.profession);
        System.out.println("Заработная плата: " + engineer.salary);

        engineer.myOccupation();
    }
}

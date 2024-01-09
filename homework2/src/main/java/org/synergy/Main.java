package org.synergy;

class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Parallelepiped extends Rectangle {
    private double height;

    public Parallelepiped(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateArea() {
        // Переопределение метода для расчета площади поверхности параллелепипеда
        return 2 * (length * width + length * height + width * height);
    }
}

public class Main {
    public static void main(String[] args) {
        // Тестирование класса Rectangle
        Rectangle rectangle = new Rectangle(5, 7);
        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea());

        // Тестирование класса Parallelepiped
        Parallelepiped parallelepiped = new Parallelepiped(3, 4, 6);
        System.out.println("Площадь параллелепипеда: " + parallelepiped.calculateArea());
        System.out.println("Объем параллелепипеда: " + parallelepiped.calculateVolume());
    }
}

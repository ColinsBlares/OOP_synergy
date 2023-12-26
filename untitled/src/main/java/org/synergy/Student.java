package org.synergy;

public class Student {
    private String name;
    private int[] grades;

    // Конструктор класса
    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    // Метод для вычисления среднего балла
    public double calculateAverageGrade() {
        if (grades.length == 0) {
            return 0.0; // Возвращаем 0, если нет оценок
        }

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    // Геттер для имени студента
    public String getName() {
        return name;
    }

    // Сеттер для имени студента
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для массива оценок
    public int[] getGrades() {
        return grades;
    }

    // Сеттер для массива оценок
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}

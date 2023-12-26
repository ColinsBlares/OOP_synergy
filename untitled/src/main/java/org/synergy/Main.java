package org.synergy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Student с именем "John" и оценками {85, 90, 78, 92}
        Student student = new Student("Иван", new int[]{5, 3, 4, 5});

        // Выводим имя студента
        System.out.println("Имя студента: " + student.getName());

        // Выводим массив оценок студента
        System.out.println("Оценки: " + Arrays.toString(student.getGrades()));

        // Вычисляем и выводим средний балл студента
        System.out.println("Средний балл: " + student.calculateAverageGrade());
    }
}

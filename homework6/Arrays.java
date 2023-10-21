package homework6;

import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        System.out.println("Добавление студента в массив:");
        students.add("John");
        students.add("Mark");
        students.add(0,"Jake");
        students.add("Allen");
        students.add(2,"Kyle");
        System.out.println(students);

        System.out.println("Удаление студента из массива:");
        students.remove(1);
        System.out.println(students);
        students.remove("Mark");
        System.out.println(students);
        students.remove(0);
        System.out.println(students);
        students.remove("Kyle");
        System.out.println(students);

        System.out.println("Снова вставляем 3х студентов в массив:");
        students.add(0, "Mark");
        students.add("Jake");
        students.add(1, "John");
        students.add(4, "Kyle");
        System.out.println(students);

        System.out.println("Находим студента из массива под индексом 2:");
        System.out.println(students.get(2));
    }
}

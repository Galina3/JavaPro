package homework6.doubleClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main {
    public static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Double>arrayList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            arrayList.add(random.nextDouble(50.0));
        }

        System.out.println("Неупорядоченный массив: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Упорядоченный массив: " + arrayList);

        ArrayWorking arrayWorking = new ArrayWorking();
        arrayWorking.add(1.0);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1.0);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1.0);
        arrayWorking.display();
        arrayWorking.add(1.0);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1.0);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1.0);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление элемента из массива: ");
        arrayWorking.deleteElement();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление массива: ");
        arrayWorking.deleteArray();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();

        arrayWorking.erase();      // Исправляем вред от взлома - приводим массив к текущему состоянию
        arrayWorking.add(14.0);
        arrayWorking.add(17.0);
        System.out.println("Второе число: " + arrayWorking.get(1));


    }

}
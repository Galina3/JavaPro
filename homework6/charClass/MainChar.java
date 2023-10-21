package homework6.charClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainChar {
        public static Random random = new Random();

        public static void main(String[] args) {
            ArrayList<Character> arrayList = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                arrayList.add((char) random.nextInt(26 + 'a'));
            }

            System.out.println("Неупорядоченный массив: " + arrayList);
            Collections.sort(arrayList);
            System.out.println("Упорядоченный массив: " + arrayList);

            ArrayWorkingChar arrayWorking = new ArrayWorkingChar();
            arrayWorking.add('A');
            arrayWorking.display();
            arrayWorking.displayInitialized();
            arrayWorking.add('A');
            arrayWorking.display();
            arrayWorking.displayInitialized();
            arrayWorking.add('A');
            arrayWorking.display();
            arrayWorking.add('A');
            arrayWorking.displayInitialized();
            arrayWorking.display();
            arrayWorking.add('A');
            arrayWorking.displayInitialized();
            arrayWorking.display();
            arrayWorking.add('A');
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
            arrayWorking.add('B');
            arrayWorking.add('C');
            System.out.println("Второе число: " + arrayWorking.get(1));

        }

}

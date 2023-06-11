package homeWork2_06;

import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        // Напишите программу на Java, которая находит сумму всех элементов в целочисленном массиве и выводит результат.

        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("сумма всех элементов " + sum);

        // Напишите программу на Java, которая находит среднее значение всех элементов в массиве с плавающей точкой и выводит результат.

        double[] array2 = new double[]{2.6, 6.1, 4.7, 3.5, 9.1};

        double sum1 = 0;

        for (int i = 0; i < array2.length; i++) {
            sum1 += array2[i];
        }
        System.out.println("среднее значение всех элементов " + sum1 / array2.length);

        //  Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве и выводит результат.

        int testValue = array[0];
        int minValue = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < testValue) {
                minValue = array[i];
                testValue = array[i];
            } else {
                minValue = testValue;
            }
        }
        System.out.println("минимальное значение в массиве " + minValue);

        int testValue1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > testValue) {
                testValue1 = array[i];
                maxValue = testValue1;

            }

        }
        System.out.println("максимальное значение в массиве " + maxValue);

        // Напишите программу на Java, которая находит количество отрицательных элементов в целочисленном массиве и выводит результат.


        int[] array4 = new int[]{-4, 0, 9, -5, 2};
        int count = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] < 0) {
                count++;
            }
        }
        System.out.println("Count of negative elements = " + count);

        //  Напишите программу на Java, которая находит индекс первого вхождения заданного элемента в строковом массиве и выводит его значение.

        String[] arrayString = {"window", "warning", "wind", "war"};
        String str = String.join("", arrayString);
        System.out.println(str);
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();


        if (str.contains(String.valueOf(test))) {
            System.out.println(str.indexOf(test));
        }

        //Напишите программу на Java, которая сортирует целочисленный массив в порядке возрастания, используя алгоритм сортировки слиянием (merge sort).

        int[] array6 = new int[]{4, 9, 6, 7, 8, 1};
        sortArray(array6);
        System.out.println(Arrays.toString(array6));

    }

    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }

        int[] arrayB = new int[array.length / 2];
        System.arraycopy(array, 0, arrayB, 0, array.length / 2);

        int[] arrayC = new int[array.length - arrayB.length];
        System.arraycopy(array, arrayB.length, arrayC, 0, array.length - arrayB.length);

        sortArray(arrayB);
        sortArray(arrayC);

        mergeArray(array, arrayB, arrayC);

        return array;
    }

    private static void mergeArray(int[] array, int[] arrayB, int[] arrayC) {

        int positionB = 0;
        int positionC = 0;

        for (int c = 0; c < array.length; c++) {
            if (positionB == arrayB.length) {
                array[c] = arrayC[positionC];
                positionC++;
            } else if (positionC == arrayC.length) {
                array[c] = arrayB[positionB];
                positionB++;
            } else if (arrayB[positionB] < arrayC[positionC]) {
                array[c] = arrayB[positionB];
                positionB++;
            } else {
                array[c] = arrayC[positionC];
                positionC++;
            }
        }
    }

}




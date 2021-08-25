package lesson9;

import java.util.Arrays;
import java.util.Random;

public class UserArray {
    public static int[] plusArrayEnd(int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static int[] plusArrayFirst(int[] array, int value) {
        int[] newArray = new int[array.length + 1];
        newArray[0] = value;
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i + 1] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(array));
        System.out.println("Добавление элемента в конец: " + Arrays.toString(plusArrayEnd(array)));
        System.out.println("Добавление элемента в начало: " + Arrays.toString(plusArrayFirst(array, 10)));
    }
}

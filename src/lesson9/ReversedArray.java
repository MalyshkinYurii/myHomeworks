package lesson9;


import java.util.Arrays;
import java.util.Random;

public class ReversedArray {
    public static int[] myReverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        return array;

    }

    public static int[] subArray(int[] array, int index, int count) {
        int[] newArray = new int[count];
        if (count > array.length - index) {
            for (int i = 0; i < array.length - 1; i++) {
                newArray[i] = array[index + i];
            }
            for (int i = array.length - 1; i < count; i++) {
                newArray[i] = 1;
            }
        } else {
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[index + i];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = rand.nextInt(5);
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(firstArray));
        System.out.println("Инвертированный массив: " + Arrays.toString(myReverse(firstArray)));
        System.out.println("Часть массива с переполнением: " + Arrays.toString(subArray(firstArray, 1, 6)));
        System.out.println("Часть массива без переполнения: " + Arrays.toString(subArray(firstArray, 1, 4)));
    }
}

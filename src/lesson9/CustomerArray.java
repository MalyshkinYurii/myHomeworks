package lesson9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
        Random rand = new Random();
        System.out.println("Введите размерность массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Массив заполняется произвольными значениями от 0 до 10...");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.print("Выводим все нечетные значения: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum += array[i];
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое массива: " + (double) (sum / array.length));
    }
}

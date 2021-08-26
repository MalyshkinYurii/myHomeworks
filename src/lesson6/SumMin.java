package lesson6;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа А и B при условии что A < B: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        if (a > b) {
            System.out.println("Ошибка! Вы ввели А > B");
        } else {
            for (int i = a; i <= b; i++) {
                sum1 += i;
            }
            System.out.println("Сумма всех чисел в промежутке от А до В: " + sum1);
            for (int j = a; j <= b; j++) {
                if (j % 2 != 0) {
                    sum2 += j;
                }
            }
            System.out.println("Сумма непарных числе в промежутке от А до В: " + sum2);
        }
    }
}

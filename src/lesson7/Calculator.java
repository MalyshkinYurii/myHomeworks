package lesson7;

import java.util.Scanner;

public class Calculator {
    public static double calculate(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        System.out.println("Введите 3 целочисленных числа: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Среднее арифметическое значение: " + calculate(a, b, c));
    }
}

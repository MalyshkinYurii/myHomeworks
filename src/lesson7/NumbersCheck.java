package lesson7;

import java.util.Scanner;

public class NumbersCheck {

    public static String checkPlusMinus(int a) {
        if (a > 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    public static String checkSimple(int a) {
        int counter = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                counter++;
            }
        }
        if (counter > 2) {
            return "Число не простое";
        } else {
            return "Число простое";
        }
    }

    public static String checkDiv(int a) {
        if ((a % 2 == 0) && (a % 5 == 0) && (a % 3 == 0) && (a % 6 == 0) && (a % 9 == 0)) {
            return "Число делится на 2, 5, 3, 6, 9 без остатка.";
        } else {
            return "Число не делится на 2, 5, 3, 6, 9 без остатка.";
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите проверяемое число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(checkPlusMinus(a));
        System.out.println(checkSimple(a));
        System.out.println(checkDiv(a));
    }
}

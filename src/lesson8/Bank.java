package lesson8;

import java.util.Scanner;

public class Bank {
    static int monthCredit = 700;

    public static void creditCheck(int a) {
        System.out.println("Вы внесли разовый платеж суммой: " + a);
        monthCredit -= a;
        if (monthCredit > 0) {
            System.out.println("Сумма задолжености: " + monthCredit + " грн");
        } else if (monthCredit < 0) {
            System.out.println("Вы переплатили за кредит! Сумма переплаты: " + Math.abs(monthCredit));
        } else if (monthCredit == 0) {
            System.out.println("Спасибо! Кредит погашен");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводите сумму платежа для продолжения работы или любую букву для завершения");
        while (sc.hasNextInt()) {
            creditCheck(sc.nextInt());
        }
    }
}

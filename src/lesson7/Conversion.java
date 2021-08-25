package lesson7;

import java.util.Scanner;

public class Conversion {
    public static double dollars(int grn) {
        return grn / 27;
    }

    public static double euros(int grn) {
        return grn / 30;
    }

    public static double rubles(int grn) {
        return grn * 3;
    }

    public static double levas(int grn) {
        return grn / 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в грывнях: ");
        int grn = sc.nextInt();
        String valuta = sc.next();
        switch (valuta) {
            case "dollars":
                System.out.println(dollars(grn));
                break;
            case "euros":
                System.out.println(euros(grn));
                break;
            case "rubles":
                System.out.println(rubles(grn));
                break;
            case "levas":
                System.out.println(levas(grn));
                break;
            default:
                System.out.println("Такой валюты нет. В наличии только: dollars, euros, rubles, levas.");
        }
    }
}

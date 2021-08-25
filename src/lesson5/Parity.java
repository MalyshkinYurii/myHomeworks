package lesson5;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a & 1) == 1) {
            System.out.println("Число непарное");
        } else {
            System.out.println("Число парное");
        }
        int b = sc.nextInt();
        if (b % 2 == 0) {
            System.out.println("Число парное");
        } else {
            System.out.println("Число непарное");
        }
    }
}

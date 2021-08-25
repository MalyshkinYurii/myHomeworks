package lesson6;

import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        System.out.println("ВВедите количество клиентов доставки: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        do {
            factorial *= n--;

        } while (n > 1);
        System.out.println("Количество возможных вариантов доставки: " + factorial);
    }
}

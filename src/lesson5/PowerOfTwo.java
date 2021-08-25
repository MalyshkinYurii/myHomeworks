package lesson5;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(((a & (a - 1)) == 0)) {
            System.out.println("Число степень двойки");
        } else {
            System.out.println("Число не степень");
        }
    }
}

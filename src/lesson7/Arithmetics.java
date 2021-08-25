package lesson7;

import java.util.Scanner;

public class Arithmetics {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String znak = sc.next();

        switch (znak) {
            case "+":
                System.out.println(add(a, b));
                break;
            case "-":
                System.out.println(sub(a, b));
                break;
            case "*":
                System.out.println(mul(a, b));
                break;
            case "/":
                System.out.println(div(a, b));
                break;
            default:
                System.out.println("Вы не введли знак");
        }
    }
}



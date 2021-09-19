package JavaEssential8.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        for (int i = 0; i < workers.length; i++) {
            System.out.println("Введите фамилию и иницыалы работника: ");
            String name = sc.nextLine();
            System.out.println("Введите год поступления на работу: ");
            int startYear = sc.nextInt();
            System.out.println();
            System.out.println("Введите должность работинка: ");
            String position = sc.nextLine();
            workers[i] = new Worker(name, position, startYear);
        }

        Arrays.toString(workers);
    }
}

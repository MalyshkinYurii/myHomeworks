package JavaEssential8.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Worker> workers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите фамилию и иницыалы работника: ");
            String name = sc.next();
            System.out.println("Введите год поступления на работу: ");
            int startYear = sc.nextInt();
            try {
                if (startYear > 2021 || startYear < 2000) {
                    throwSecondError();
                }

            } catch (Exception e) {
                System.err.println(e);

            }
            System.out.println();
            System.out.println("Введите должность работинка: ");
            String position = sc.next();
            Worker price = new Worker(name, position, startYear);
            workers.add(price);
            System.out.println("Введите стаж работника");
            int yearsOfWorking = sc.nextInt();
            try {
                if (startYear != 2021 - yearsOfWorking) {
                    throwFirstError();
                }

            } catch (Exception e) {
                System.err.println(e);
                System.out.println("Стаж работы " + price.name + "'а" + " превышает введеное значение");
            }
        }
        workers.sort(Comparator.comparing(Worker::getName));

        System.out.println(workers.toString());


    }


    public static void throwFirstError() throws Exception {
        Exception exception = new Exception("Incorrect year!");
        throw exception;
    }

    public static void throwSecondError() throws Exception {
        Exception exception = new Exception("Incorrect year format!");
        throw exception;
    }
}


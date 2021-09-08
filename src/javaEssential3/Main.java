package javaEssential3;

import javaEssential3.task2.*;
import javaEssential3.task3.Car;
import javaEssential3.task3.Plane;
import javaEssential3.task3.Ship;
import javaEssential3.task3.Vehicle;
import javaEssential3.task4.DocumentWorker;
import javaEssential3.task4.ExpertDocumentWorker;
import javaEssential3.task4.ProDocumentWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.startTask2();
        System.out.println();
        main.startTask3();
        System.out.println();
        System.out.println("Введите ключ: ");
        main.startTask4();

    }

    void startTask2() {
        BadPupil badPupil = new BadPupil();
        GoodPupil goodPupil = new GoodPupil();
        ExcelentPupil excelentPupil = new ExcelentPupil();
        Pupil pupil = new BadPupil();
        ClassRoom classRoom = new ClassRoom(pupil, badPupil, excelentPupil, goodPupil);

    }

    void startTask3() {
        Car car = new Car(2000, 60.0, 1992, 22, 8);
        Ship ship = new Ship(12321, 100.0, 2000, 32, 2, 3115, 200);
        Plane plane = new Plane(10000, 200.0, 2004, 11, 9, 321312, 250);
        System.out.println(car.toString());
        System.out.println(ship.toString());
        System.out.println(plane.toString());
    }

    void startTask4() {
        Scanner scanner = new Scanner(System.in);
        String numberKey = scanner.next();
        if (numberKey.equalsIgnoreCase("pro")) {
            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
            System.out.println("Вы в версии про");
        } else if (numberKey.equalsIgnoreCase("exp")) {
            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
            System.out.println("Вы в версии эксперт");
        } else {
            DocumentWorker documentWorker = new DocumentWorker();
            System.out.println("Вы в обычной версии");
        }
    }
}

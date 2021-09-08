package javaEssential2.task4;

import javaEssential2.task3.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new javaEssential2.task3.Car();
        Car car1 = new javaEssential2.task3.Car(1998);
        Car car2 = new javaEssential2.task3.Car(1998, 40.0);
        Car car3 = new javaEssential2.task3.Car(1998, 40.0, 500);
        Car car4 = new Car(1998, 40.0, 500, "green");
    }
}

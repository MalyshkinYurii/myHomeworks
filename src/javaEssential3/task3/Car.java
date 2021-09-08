package javaEssential3.task3;

public class Car extends Vehicle {
    public Car(int price, double speed, int year, int x, int y) {
        super(price, speed, year, x, y);
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "}";
    }
}

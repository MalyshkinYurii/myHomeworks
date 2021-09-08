package javaEssential3.task3;

public class Vehicle {
    int price;
    double speed;
    int year;
    int x;
    int y;

    public Vehicle(int price, double speed, int year, int x, int y) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return
                "price=" + price +
                        ", speed=" + speed +
                        ", year=" + year +
                        ", x=" + x +
                        ", y=" + y
                ;
    }
}

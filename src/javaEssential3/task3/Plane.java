package javaEssential3.task3;

public class Plane extends Vehicle {
    int height;
    int countPassengers;

    public Plane(int price, double speed, int year, int x, int y, int height, int countPassengers) {
        super(price, speed, year, x, y);
        this.countPassengers = countPassengers;
        this.height = height;

    }

    public String toString() {
        return "Plane{" +
                "height=" + height +
                ", countPassengers=" + countPassengers +
                super.toString() + "}";
    }

}

package javaEssential3.task3;

public class Ship extends Vehicle {
    int portPripiski;
    int countPassengers;

    public Ship(int price, double speed, int year, int x, int y, int portPripiski, int countPassengers) {
        super(price, speed, year, x, y);
        this.countPassengers = countPassengers;
        this.portPripiski = portPripiski;

    }

    @Override
    public String toString() {
        return "Ship{" +
                "portPripiski=" + portPripiski +
                ", countPassengers=" + countPassengers +
                super.toString() +
                '}';
    }
}
